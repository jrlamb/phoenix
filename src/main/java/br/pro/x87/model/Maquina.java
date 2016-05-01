package br.pro.x87.model;

/**
 * *********************************************************************
 * Module: Maquina.java Author: Juliano Purpose: Defines the Class Maquina
 * *********************************************************************
 */
import br.pro.x87.enums.TMaquina;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "maquina", catalog = "maqcontrol")
public class Maquina {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "descricao", length = 50)
    private String descricao;

    //@OneToOne
    //@JoinColumn(name = "idMarca")
    @ManyToOne
    @JoinColumn(name = "id_marca", foreignKey = @ForeignKey(name = "FK_MARCA_MAQUINA"))
    public Marca marca;

    //@Enumerated(EnumType.STRING)
    @Column(name = "tipoMaquina", length = 60)
    private TMaquina tipoMaquina;

    public Maquina() {
        // TODO: implement
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Maquina(String descricao, Marca marca, TMaquina tipoMaquina) {
        this.descricao = descricao;
        this.marca = marca;
        this.tipoMaquina = tipoMaquina;
    }

}
