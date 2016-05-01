/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Manutencao> manutencao;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Maquina> maquina;
    
    @ManyToOne
    @JoinColumn(name = "id_area", foreignKey = @ForeignKey(name = "FK_AREA_OPERACAO"))
    public Area area;

    @OneToMany(mappedBy = "operacao", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OperacaoServico> operacaoServico = new ArrayList<>();

//    @OneToOne
//    @JoinColumn(name = "idTipo")
    @ManyToOne
    @JoinColumn(name = "id_toperacao", foreignKey = @ForeignKey(name = "FK_TOPERACAO_OPERACAO"))
    public TipoOperacao tipoOperacao;

    //@OneToOne
    //@JoinColumn(name = "idFuncionario")
    @ManyToOne
    @JoinColumn(name = "id_funcionario", foreignKey = @ForeignKey(name = "FK_FUNCIONARIO_OPERACAO"))
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
