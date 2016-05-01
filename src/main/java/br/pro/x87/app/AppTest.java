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
        
        marca.setDescricao("sobrescruti");
        dao.update(marca);
        
        
    }
    
}
