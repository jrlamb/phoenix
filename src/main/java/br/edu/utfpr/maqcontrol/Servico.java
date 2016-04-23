/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.maqcontrol;

import br.edu.utfpr.enums.TServico;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
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
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "descricao", length = 50)
    private String descricao;

    @Column(name = "tipo", length = 50)
    private TServico tipoServico;

    public Servico() {
    }
    
    
}
