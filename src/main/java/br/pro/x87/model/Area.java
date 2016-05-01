/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author Juliano Rodrifo Lamb
 */
@Entity
@Table(name = "area", catalog = "maqcontrol")
public class Area implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

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

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
}
