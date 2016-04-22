/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.maqcontrol;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author JulianoRodrigo
 */
@Entity
@Table(name = "endereco", catalog = "maqcontrol")
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @OneToOne
    @JoinColumn(name = "idBairro")
    private Bairro idBairro;

    @Column(name = "descricao", length = 80)
    private String descricao;

    public Endereco(Bairro idBairro, String descricao) {
        this.idBairro = idBairro;
        this.descricao = descricao;
    }

    public Endereco() {

    }

}
