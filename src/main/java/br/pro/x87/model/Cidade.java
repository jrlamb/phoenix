/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.model;

import br.pro.x87.enums.TEstado;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author JulianoRodrigo
 */
@Entity
@Table(name = "cidade", catalog = "maqcontrol")
public class Cidade implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "nome", length = 50)
    private String nome;

    @Column(name = "estado", length = 20)
    //@Enumerated(EnumType.STRING)
    private TEstado estado;

    public Cidade() {
    }

    public Cidade(String nome, TEstado estado) {
        this.nome = nome;
        this.estado = estado;
    }
}
