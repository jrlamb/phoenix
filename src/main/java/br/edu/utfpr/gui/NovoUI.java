/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.gui;

import javax.swing.JButton;

/**
 *
 * @author JulianoRodrigo
 */
public class NovoUI implements StateUI{

    @Override
    public void gerenciar(JButton bNovo, JButton bSalvar, JButton bListagem, JButton bExcluir, JButton bFechar) {
        bNovo.setEnabled(false);
        bSalvar.setEnabled(true);
        bListagem.setEnabled(true);
        bExcluir.setEnabled(false);
        bFechar.setEnabled(true);
    }
    
}
