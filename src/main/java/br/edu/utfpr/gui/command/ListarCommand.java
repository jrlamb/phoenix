/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.gui.command;

import br.edu.utfpr.dao.DAO;
import br.edu.utfpr.maqcontrol.Marca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JulianoRodrigo
 */
public class ListarCommand implements Command {

    DAO dao;

    public ListarCommand() {
        this.dao = new DAO();
    }

    @Override
    public void execute(Object o) {
        List lista = new ArrayList();
        lista = dao.get(o.getClass().getName());
//        Marca m = new Marca();
//        
//        for (Object lista1 : lista) {
//            m = (Marca)lista1;
//            System.out.println(m.getDescricao());
//        }
    }

}
