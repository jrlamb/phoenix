/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.view.command;

import br.pro.x87.dao.DAO;
import javax.swing.JOptionPane;

/**
 *
 * @author JulianoRodrigo
 */
public class SalvarCommand implements Command {

    @Override
    public void execute(Object o) {
        DAO dao = new DAO();
        dao.update(o);
    }
    
}
