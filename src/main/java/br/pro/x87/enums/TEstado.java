/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.enums;

/**
 *
 * @author JulianoRodrigo
 */
public enum TEstado {
    PARANA ("Paraná"), SANTA_CATARINA ("Santa Catarina"), RIO_GRANDE_DO_SUL ("Rio Grande do Sul");    
    
    private String nome;   

    private TEstado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }    
}
