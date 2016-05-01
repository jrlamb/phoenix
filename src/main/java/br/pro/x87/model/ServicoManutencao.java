/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.model;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Juliano Rodrifo Lamb
 */
@Entity
@Table(name = "servico_manutencao", catalog = "maqcontrol")
public class ServicoManutencao implements Serializable {

    @Id
    @ManyToOne
    private Manutencao manutencao;

    @Id
    @ManyToOne
    private Servico servico;

    @Id
    @ManyToOne
    private Produto produto;

    @Column(name = "quantidade")
    private float quantidade;
    
    @Column(name = "custo")    
    private float custo;
    
    @Column(name = "observacao", length = 100)
    private String observacao;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.manutencao);
        hash = 11 * hash + Objects.hashCode(this.servico);
        hash = 11 * hash + Objects.hashCode(this.produto);
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
        final ServicoManutencao other = (ServicoManutencao) obj;
        if (!Objects.equals(this.manutencao, other.manutencao)) {
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
