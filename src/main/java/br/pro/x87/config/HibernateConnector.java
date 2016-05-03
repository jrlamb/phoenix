/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.config;

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
        cfg.setProperty("hibernate.connection.password", "root");
        cfg.setProperty("hibernate.show_sql", "true");
        cfg.setProperty("hibernate.hbm2ddl.auto", "update");

        /**
         * Mapping Resources..
         */
        cfg.addAnnotatedClass(br.pro.x87.model.Marca.class);
        cfg.addAnnotatedClass(br.pro.x87.model.Maquina.class);

        cfg.addAnnotatedClass(br.pro.x87.model.CotacaoProduto.class);
        cfg.addAnnotatedClass(br.pro.x87.model.Cidade.class);
        cfg.addAnnotatedClass(br.pro.x87.model.Bairro.class);
        cfg.addAnnotatedClass(br.pro.x87.model.Endereco.class);
        cfg.addAnnotatedClass(br.pro.x87.model.Area.class);
        cfg.addAnnotatedClass(br.pro.x87.model.Empresa.class);
        cfg.addAnnotatedClass(br.pro.x87.model.Manutencao.class);

        cfg.addAnnotatedClass(br.pro.x87.model.Operacao.class);
        cfg.addAnnotatedClass(br.pro.x87.model.TipoOperacao.class);
        cfg.addAnnotatedClass(br.pro.x87.model.Funcao.class);
        cfg.addAnnotatedClass(br.pro.x87.model.Funcionario.class);
        cfg.addAnnotatedClass(br.pro.x87.model.Servico.class);
        cfg.addAnnotatedClass(br.pro.x87.model.OperacaoServico.class);
        cfg.addAnnotatedClass(br.pro.x87.model.ServicoManutencao.class);
        cfg.addAnnotatedClass(br.pro.x87.model.Produto.class);
        cfg.addAnnotatedClass(br.pro.x87.model.Vinculo.class);

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
