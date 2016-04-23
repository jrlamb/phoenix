/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.app;

import br.edu.utfpr.dao.DAO;
import br.edu.utfpr.maqcontrol.CotacaoProduto;
import br.edu.utfpr.maqcontrol.Maquina;
import br.edu.utfpr.maqcontrol.Marca;
import br.edu.utfpr.maqcontrol.Produto;
import br.edu.utfpr.enums.TMaquina;
import br.edu.utfpr.enums.TProduto;
import java.util.Date;

/**
 *
 * @author Juliano Rodrifo Lamb
 */
public class App {

    public static void main(String[] args) {
        DAO dao = new DAO();
        Marca marca = new Marca("John Deere");
        dao.add(marca);

        //Maquina maquina = new Maquina("Maquina", marca, TMaquina.COLHEDORA);
        //dao.add(maquina);

////        Produto produto = new Produto("Filtro", TProduto.FILTRO_AR_FILTRANTE, 100, TMaquina.TRATOR, marca);
////        dao.add(produto);
//
//        Date now = new Date();
//        // SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
//
//        CotacaoProduto cotacaoProduto = new CotacaoProduto(now, produto, 100.5f);
//        dao.add(cotacaoProduto);
//        System.exit(0);

    }
}
