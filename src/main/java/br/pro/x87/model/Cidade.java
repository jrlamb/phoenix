/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.model;

import br.pro.x87.controller.Titulo;
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

    @Column(name = "estado", length = 30)
    private String estado;

    public Cidade() {
    }

    public Cidade(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    @Titulo(nome = "Nome", numeroDaColuna = 1)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Titulo(nome = "Estado", numeroDaColuna = 2)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Titulo(nome = "Código", numeroDaColuna = 0)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
