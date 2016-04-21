package br.edu.utfpr.maqcontrol;

/**
 * *********************************************************************
 * Module: Produto.java Author: Juliano Purpose: Defines the Class Produto
 * *********************************************************************
 */
import br.edu.utfpr.enums.TipoMaquina;
import br.edu.utfpr.enums.TipoProduto;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produto", catalog = "maqcontrol")
public class Produto {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "descricao", length = 50)
    private String descricao;

    @Column(name = "tipo", length = 60)
    private TipoProduto tipo;

    @Column(name = "troca")
    private int troca;

    @Column(name = "aplicacao", length = 60)
    private TipoMaquina tipoMaquina;

    @OneToOne
    @JoinColumn(name = "idMarca")
    public Marca marca;

    public Produto() {
        // TODO: implement
    }

    public Produto(String descricao, TipoProduto tipo, int troca, TipoMaquina tipoMaquina, Marca marca) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.troca = troca;
        this.tipoMaquina = tipoMaquina;
        this.marca = marca;
    }



}
