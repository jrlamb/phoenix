package br.edu.utfpr.maqcontrol;

/**
 * *********************************************************************
 * Module: CotacaoProduto.java Author: Juliano Purpose: Defines the Class
 * CotacaoProduto
 * *********************************************************************
 */
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "cotacaoProduto", catalog = "maqcontrol")
public class CotacaoProduto implements Serializable{

    @Id
    @Column(name="data", length = 50)
    @Type(type="date")
    private Date data;
    
    @Id
    @ManyToOne
    @JoinColumn(name = "idProduto", nullable = false)
    private Produto produto;

    @Column(name="valor", length = 50)
    private Float valor;

    public CotacaoProduto() {
        // TODO: implement
    }

    public CotacaoProduto(Date data, Produto produto, Float valor) {
        this.data = data;
        this.produto = produto;
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.data);
        hash = 71 * hash + Objects.hashCode(this.produto);
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
        final CotacaoProduto other = (CotacaoProduto) obj;
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        return true;
    }

    
    
}
