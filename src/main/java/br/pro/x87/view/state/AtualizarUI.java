/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.view.state;

import javax.swing.JButton;

/**
 *
 * @author JulianoRodrigo
 */
public class AtualizarUI implements StateUI {

    @Override
    public void gerenciar(JButton bNovo, JButton bSalvar, JButton bListagem, JButton bExcluir, JButton bFechar) {
        bNovo.setEnabled(true);
        bSalvar.setEnabled(true);
        bListagem.setEnabled(true);
        bExcluir.setEnabled(true);
        bFechar.setEnabled(true);
    }

}
