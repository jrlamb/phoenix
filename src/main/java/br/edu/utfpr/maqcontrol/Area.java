/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.maqcontrol;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Juliano Rodrifo Lamb
 */
@Entity
@Table(name = "area", catalog = "maqcontrol")
public class Area implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_empresa", foreignKey = @ForeignKey(name = "FK_EMPRESA_AREA"))
    public Empresa empresa;

    @Column(name = "descricao", length = 60)
    private String descricao;

    @Column(name = "tamanho")
    private float tamanho;

    public Area() {
    }

    public Area(String descricao, float tamanho) {
        this.descricao = descricao;
        this.tamanho = tamanho;
    }

    public void addEmpresa(Empresa e) {
        this.empresa = e;
    }
}
