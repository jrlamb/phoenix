/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.maqcontrol;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

/**
 *
 * @author JulianoRodrigo
 */
@Entity
@Table(name = "funcionario", catalog = "maqcontrol")
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idFuncionario", unique = true, nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_endereco", foreignKey = @ForeignKey(name = "FK_ENDERECO_FUNCIONARIO"))
    public Endereco endereco;

    @OneToMany(mappedBy = "funcionario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Vinculo> vinculo = new ArrayList<>();

    @Column(name = "nome", length = 60)
    private String nome;

    @Column(name = "rg", length = 15)
    private String rg;

    @Column(name = "cpf", length = 15)
    private String cpf;

    @Column(name = "pis", length = 20)
    private String pis;

    @Column(name = "ctps", length = 20)
    private String ctps;

    @Column(name = "fone", length = 15)
    private String fone;


}
