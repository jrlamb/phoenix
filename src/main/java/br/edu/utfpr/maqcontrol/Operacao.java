/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.maqcontrol;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

/**
 *
 * @author Juliano Rodrifo Lamb
 */
@Entity
@Table(name = "operacao", catalog = "maqcontrol")
public class Operacao implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idOperacao", unique = true, nullable = false)
    private int id;
    
    @Column(name = "tamanhoArea")
    private float tamanhoArea;
    
    @ManyToMany
    @JoinTable(name = "manutencaoOperacao", catalog = "maqcontrol",
            joinColumns = {
                @JoinColumn(name = "idOperacao")},
            inverseJoinColumns = {
                @JoinColumn(name = "idManutencao")})
    private List<Manutencao> manutencao;

    @OneToOne
    @JoinColumn(name = "idArea")
    public Area area;

    @OneToOne
    @JoinColumn(name = "idTipo")
    public TipoOperacao tipoOperacao;



    @OneToOne
    @JoinColumn(name = "idFuncionario")
    public Funcionario funcionario;

    @Type(type = "date")
    @Column(name = "data")
    private Date data;

    @Column(name = "observacao", length = 60)
    private String observao;

    @Column(name = "duracao")
    private float duracao;

    @Column(name = "largura")
    private float largura;

    @Column(name = "eficiencia")
    private float eficiencia;

    @Column(name = "velocidade")
    private float velocidade;

    @Column(name = "horimetro")
    private float horimetro;

    @Column(name = "combustivel")
    private float combustivel;

    @Column(name = "graxa")
    private float graxa;

    public Operacao() {
    }

}
