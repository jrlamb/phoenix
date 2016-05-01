/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

/**
 *
 * @author JulianoRodrigo
 */
@Entity
@Table(name = "operacao_servico", catalog = "maqcontrol")
public class OperacaoServico implements Serializable {

    @Id
    @ManyToOne
    private Operacao operacao;

    @Id
    @ManyToOne
    private Servico servico;

    @Id
    @ManyToOne
    private Produto produto;

    @Column(name = "valorUnitario")
    private float valorUnitario;

    @Column(name = "quantidade")
    private float quantidade;

    @Type(type = "date")
    @Column(name = "inicio")
    private Date inicio;

    @Type(type = "date")
    @Column(name = "fim")
    private Date fim;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.operacao);
        hash = 97 * hash + Objects.hashCode(this.servico);
        hash = 97 * hash + Objects.hashCode(this.produto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OperacaoServico other = (OperacaoServico) obj;
        if (!Objects.equals(this.operacao, other.operacao)) {
            return false;
        }
        if (!Objects.equals(this.servico, other.servico)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }



}
