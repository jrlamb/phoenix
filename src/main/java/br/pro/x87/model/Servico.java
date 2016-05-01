/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.model;

import br.pro.x87.enums.TServico;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Juliano Rodrifo Lamb
 */
@Entity
@Table(name = "servico", catalog = "maqcontrol")
public class Servico implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idServico", unique = true, nullable = false)
    private int id;

    @OneToMany(mappedBy = "servico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OperacaoServico> operacaoServico = new ArrayList<>();  

    @OneToMany(mappedBy = "servico", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ServicoManutencao> servicoManutencao = new ArrayList<>();

    @Column(name = "descricao", length = 50)
    private String descricao;

    @Column(name = "tipo", length = 50)
    private TServico tipoServico;

    public Servico() {
    }

}
