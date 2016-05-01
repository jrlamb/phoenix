/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Juliano Rodrifo Lamb
 */
@Entity
@Table(name = "empresa", catalog = "maqcontrol")
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vinculo> vinculo = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(name = "id_endereco", foreignKey = @ForeignKey(name = "FK_ENDERECO_EMPRESA"))
    public Endereco endereco;

    @Column(name = "nomeFantasia", length = 60)
    private String nomeFantasia;

    @Column(name = "razaoSocial", length = 60)
    private String razaoSocial;

    public Empresa() {
    }

    public Empresa(Endereco endereco, String nomeFantasia, String razaoSocial) {
        this.endereco = endereco;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
    }

}
