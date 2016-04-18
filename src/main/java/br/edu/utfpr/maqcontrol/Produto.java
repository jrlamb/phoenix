package br.edu.utfpr.maqcontrol;

/**
 * *********************************************************************
 * Module: Produto.java Author: Juliano Purpose: Defines the Class Produto
 * *********************************************************************
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
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
    private String tipo;
    
    @Column(name = "troca")
    private int troca;
    
    @Column(name = "tipoMaquina")
    private int tipoMaquina;

    public Marca marca;

    public Produto() {
        // TODO: implement
    }

}
