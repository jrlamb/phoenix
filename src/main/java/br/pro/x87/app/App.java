/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.app;

import br.pro.x87.dao.DAO;
import br.pro.x87.model.CotacaoProduto;
import br.pro.x87.model.Maquina;
import br.pro.x87.model.Marca;
import br.pro.x87.model.Produto;
import br.pro.x87.enums.TMaquina;
import br.pro.x87.enums.TProduto;
import br.pro.x87.view.Principal;
import java.util.Date;

/**
 *
 * @author Juliano Rodrifo Lamb
 */
public class App {

    public static void main(String[] args) {
        new Principal().setVisible(true);
//        DAO dao = new DAO();
//        Marca marca = new Marca("John Deere");
//        dao.add(marca);

        //Maquina maquina = new Maquina("Maquina", marca, TMaquina.COLHEDORA);
        //dao.add(maquina);
//        Produto produto = new Produto("Filtro", TProduto.FILTRO_AR_FILTRANTE, 100, TMaquina.TRATOR, marca);
//        dao.add(produto);
//
//        Date now = new Date();
//        // SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
//
//        CotacaoProduto cotacaoProduto = new CotacaoProduto(now, produto, 100.5f);
//        dao.add(cotacaoProduto);
//        System.exit(0);
    }
}
