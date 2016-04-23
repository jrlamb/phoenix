package br.edu.utfpr.maqcontrol;

/**
 * *********************************************************************
 * Module: Produto.java Author: Juliano Purpose: Defines the Class Produto
 * *********************************************************************
 */
import br.edu.utfpr.enums.TMaquina;
import br.edu.utfpr.enums.TProduto;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produto", catalog = "maqcontrol")
public class Produto {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idProduto", unique = true, nullable = false)
    private int id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.produto", cascade=CascadeType.ALL)
    private List<OperacaoServico> operacaoServico;

    @Column(name = "descricao", length = 50)
    private String descricao;

    @Column(name = "tipo", length = 60)
    private TProduto tipo;

    @Column(name = "troca")
    private int troca;

    @Column(name = "aplicacao", length = 60)
    //@Enumerated(EnumType.STRING)
    private TMaquina tipoMaquina;

    @OneToOne
    @JoinColumn(name = "idMarca")
    public Marca marca;

    public Produto() {
        // TODO: implement
    }

    public Produto(String descricao, TProduto tipo, int troca, TMaquina tipoMaquina, Marca marca) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.troca = troca;
        this.tipoMaquina = tipoMaquina;
        this.marca = marca;
    }

}
