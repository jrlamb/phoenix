/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.maqcontrol;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

/**
 *
 * @author JulianoRodrigo
 */
@Entity
@Table(name = "operacao_servico", catalog = "maqcontrol")
@AssociationOverrides({
    @AssociationOverride(name = "pk.servico",
            joinColumns = @JoinColumn(name = "idServico")),
    @AssociationOverride(name = "pk.operacao",
            joinColumns = @JoinColumn(name = "idOperacao")),
    @AssociationOverride(name = "pk.produto",
            joinColumns = @JoinColumn(name = "idProduto")),})

public class OperacaoServico implements Serializable {

    @EmbeddedId
    private OperacaoServicoId pk = new OperacaoServicoId();

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
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.pk);
        hash = 37 * hash + Float.floatToIntBits(this.valorUnitario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OperacaoServico other = (OperacaoServico) obj;
        if (!Objects.equals(this.pk, other.pk)) {
            return false;
        }
        if (Float.floatToIntBits(this.valorUnitario) != Float.floatToIntBits(other.valorUnitario)) {
            return false;
        }
        return true;
    }

}
