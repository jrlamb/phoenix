/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.app;

import br.pro.x87.dao.DAO;
import br.pro.x87.model.Marca;

/**
 *
 * @author JulianoRodrigo
 */
public class AppTest {
    public static void main(String[] args) {
        DAO dao = new DAO();
        Marca marca = new Marca("teste");
        
        
        
        dao.add(marca);
        
        
        DAO dao1 = new DAO();
        Marca marca1;
        marca1 = marca;
        marca1.setDescricao("sobrescruti");
        dao1.update(marca1);
        
        
    }
    
}
