/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import br.edu.utfpr.config.HibernateConnector;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author JulianoRodrigo
 */
public class StudentDao {

//    public List<Student> listStudent() {
//        Session session = null;
//        try {
//            session = HibernateConnector.getInstance().getSession();
//            Query query = session.createQuery("from Student s");
//
//            List queryList = query.list();
//            if (queryList != null && queryList.isEmpty()) {
//                return null;
//            } else {
//                System.out.println("list " + queryList);
//                return (List<Student>) queryList;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        } finally {
//            session.close();
//        }
//    }
//
//    public Student findStudentById(int id) {
//        Session session = null;
//        try {
//            session = HibernateConnector.getInstance().getSession();
//            Query query = session.createQuery("from Student s where s.id = :id");
//            query.setParameter("id", id);
//
//            List queryList = query.list();
//            if (queryList != null && queryList.isEmpty()) {
//                return null;
//            } else {
//                return (Student) queryList.get(0);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        } finally {
//            session.close();
//        }
//    }
//
//    public void updateStudent(Student student) {
//        Session session = null;
//        try {
//            session = HibernateConnector.getInstance().getSession();
//            session.saveOrUpdate(student);
//            session.flush();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//    }
//
//    public Student addStudent(Student student) {
//        Session session = null;
//        Transaction transaction = null;
//        try {
//            session = HibernateConnector.getInstance().getSession();
//            transaction = session.beginTransaction();
//            session.save(student);
//            transaction.commit();
//            return student;
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        } finally {
//            session.close();
//        }
//    }
//
//    public void deleteStudent(int id) {
//        Session session = null;
//        try {
//            session = HibernateConnector.getInstance().getSession();
//            Transaction beginTransaction = session.beginTransaction();
//            Query createQuery = session.createQuery("delete from Student s where s.id =:id");
//            createQuery.setParameter("id", id);
//            createQuery.executeUpdate();
//            beginTransaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            session.close();
//        }
//    }
}
