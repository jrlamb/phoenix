/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.maqcontrol;

import java.io.Serializable;
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
import javax.persistence.Table;
import org.hibernate.annotations.Type;

/**
 *
 * @author Juliano Rodrifo Lamb
 */
@Entity
@Table(name = "vinculo", catalog = "maqcontrol")
public class Vinculo implements Serializable {

    @Id
    @ManyToOne
    private Funcionario funcionario;
    
    @Id
    @ManyToOne
    private Empresa empresa;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Funcao> funcao;

    @Type(type = "date")
    @Column(name = "admissao")
    private Date admissao;

    @Type(type = "date")
    @Column(name = "demissao")
    private Date demissao;

    @Column(name = "quantidadeHoras")
    private float quantidadeHoras;

    @Column(name = "salario")
    private float salario;

    @Column(name = "status", length = 12)
    private String status;
}
