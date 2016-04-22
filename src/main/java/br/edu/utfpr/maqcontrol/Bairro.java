/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.maqcontrol;

import br.edu.utfpr.enums.TipoMaquina;
import br.edu.utfpr.enums.TipoProduto;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author JulianoRodrigo
 */
@Entity
@Table(name = "bairro", catalog = "maqcontrol")
public class Bairro implements Serializable {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @OneToOne
    @JoinColumn(name = "idCidade")
    public Cidade cidade;

    @Column(name = "descricao", length = 50)
    private String descricao;

    @Column(name = "cep", length = 9)
    private String cep;

    public Bairro() {
    }

    public Bairro(Cidade cidade, String descricao, String cep) {
        this.cidade = cidade;
        this.descricao = descricao;
        this.cep = cep;
    }

}
