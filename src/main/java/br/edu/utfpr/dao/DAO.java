/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.config.HibernateConnector;
import br.edu.utfpr.maqcontrol.Maquina;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author JulianoRodrigo
 */
public class DAO<T> {

    Session session = null;
    Transaction transaction = null;

    public void add(T object) {
        try {
            session = HibernateConnector.getInstance().getSession();
            transaction = session.beginTransaction();
            session.save(object);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void delete(T object) {
        try {
            transaction = session.beginTransaction();
            session.delete(object);
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void update(T object) {
        try {
            session.saveOrUpdate(object);
            session.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

//    public void delete(int id) {
//        try {
//            session = HibernateConnector.getInstance().getSession();
//            Transaction beginTransaction = session.beginTransaction();
//            Query createQuery = session.createQuery("delete from Maquina s where s.id =:id");
//            createQuery.setParameter("id", id);
//            createQuery.executeUpdate();
//            beginTransaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//    }
//    public List<Maquina> listMaquina() {
//        Session session = null;
//        try {
//            session = HibernateConnector.getInstance().getSession();
//            Query query = session.createQuery("from Maquina s");
//
//            List queryList = query.list();
//            if (queryList != null && queryList.isEmpty()) {
//                return null;
//            } else {
//                System.out.println("list " + queryList);
//                return (List<Maquina>) queryList;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        } finally {
//            session.close();
//        }
//    }
//
//    public Maquina findMaquinaById(int id) {
//        Session session = null;
//        try {
//            session = HibernateConnector.getInstance().getSession();
//            Query query = session.createQuery("from Maquina s where s.id = :id");
//            query.setParameter("id", id);
//
//            List queryList = query.list();
//            if (queryList != null && queryList.isEmpty()) {
//                return null;
//            } else {
//                return (Maquina) queryList.get(0);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        } finally {
//            session.close();
//        }
//    }
//
//    public void updateMaquina(Maquina maquina) {
//        Session session = null;
//        try {
//            session = HibernateConnector.getInstance().getSession();
//            session.saveOrUpdate(maquina);
//            session.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//    }

}
