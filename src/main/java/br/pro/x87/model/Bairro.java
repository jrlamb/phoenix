/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.model;

import br.pro.x87.enums.TMaquina;
import br.pro.x87.enums.TProduto;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author JulianoRodrigo
 */
@Entity
@Table(name = "bairro", catalog = "maqcontrol")
public class Bairro implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

//    @OneToOne
//    @JoinColumn(name = "idCidade")
    @ManyToOne
    @JoinColumn(name = "id_cidade", foreignKey = @ForeignKey(name = "FK_CIDADE_BAIRRO"))    
    public Cidade cidade;

    @Column(name = "descricao", length = 50)
    private String descricao;

    @Column(name = "cep", length = 9)
    private String cep;

    public Bairro() {
    }

    public Bairro(Cidade cidade, String descricao, String cep) {
        this.cidade = cidade;
        this.descricao = descricao;
        this.cep = cep;
    }

}
