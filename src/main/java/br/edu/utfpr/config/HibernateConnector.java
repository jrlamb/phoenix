/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.config;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author JulianoRodrigo
 */
public class HibernateConnector {

    private static HibernateConnector me;
    private Configuration cfg;
    private SessionFactory sessionFactory;

    private HibernateConnector() throws HibernateException {

        // build the config
        cfg = new Configuration();

        /**
         * Connection Information..
         */
        cfg.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
        cfg.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/maqcontrol");
        cfg.setProperty("hibernate.connection.username", "root");
        cfg.setProperty("hibernate.connection.password", "mysql");
        cfg.setProperty("hibernate.show_sql", "false");
        cfg.setProperty("hibernate.hbm2ddl.auto", "create");
        
        /**
         * Mapping Resources..
         */
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.Marca.class);
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.Maquina.class);
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.Produto.class);
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.CotacaoProduto.class);
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.Cidade.class);
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.Bairro.class);
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.Endereco.class);
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.Area.class);
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.Empresa.class);
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.Operacao.class);
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.TipoOperacao.class);
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.Funcao.class);
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.Funcionario.class);
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.Manutencao.class);
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.Servico.class);
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.OperacaoServico.class);
        cfg.addAnnotatedClass(br.edu.utfpr.maqcontrol.OperacaoServicoId.class);
        
        

        sessionFactory = cfg.buildSessionFactory();
    }

    public static synchronized HibernateConnector getInstance() throws HibernateException {
        if (me == null) {
            me = new HibernateConnector();
        }

        return me;
    }

    public Session getSession() throws HibernateException {
        Session session = sessionFactory.openSession();
        if (!session.isConnected()) {
            this.reconnect();
        }
        return session;
    }

    private void reconnect() throws HibernateException {
        this.sessionFactory = cfg.buildSessionFactory();
    }
}
