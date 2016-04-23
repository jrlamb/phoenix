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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Juliano Rodrifo Lamb
 */
@Entity
@Table(name = "manutencao", catalog = "maqcontrol")
public class Manutencao implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idManutencao", unique = true, nullable = false)
    private int id;

    @OneToMany(mappedBy = "manutencao", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ServicoManutencao> servicoManutencao = new ArrayList<>();

    @ManyToMany(mappedBy = "manutencao")
    private List<Operacao> operacao;

    @ManyToOne
    @JoinColumn(name = "id_maquina", foreignKey = @ForeignKey(name = "FK_MAQUINA_MANUTENCAO"))
    public Maquina maquina;

    @ManyToOne
    @JoinColumn(name = "id_funcionario", foreignKey = @ForeignKey(name = "FK_FUNCIONARIO_MANUTENCAO"))
    public Funcionario funcionario;

    @Column(name = "incioS")
    private Date inicio;

    @Column(name = "fim")
    private Date fim;

    @Column(name = "horaMaquina")
    private int horaMaquina;

    @Column(name = "observacao", length = 100)
    private String observacao;

    public Manutencao() {
    }

}
