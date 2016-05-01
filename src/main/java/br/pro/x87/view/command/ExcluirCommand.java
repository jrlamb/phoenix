/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.view.command;

import javax.swing.JOptionPane;

/**
 *
 * @author JulianoRodrigo
 */
public class ExcluirCommand implements Command{

    @Override
    public void execute(Object o) {
        JOptionPane.showMessageDialog(null, "Excluir");
    }
    
}
