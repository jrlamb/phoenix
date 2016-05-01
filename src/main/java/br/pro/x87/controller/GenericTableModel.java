/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.pro.x87.controller;

import java.lang.reflect.Method;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author marcio
 */
public class GenericTableModel extends AbstractTableModel {

    private List<?> lista;
    private Class<?> cl;

   

    public GenericTableModel(List<?> lista, Class c) {
        this.lista = lista;
        this.cl = c;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        int campos = 0;
        for(Method m: cl.getDeclaredMethods()) {
            if(m.isAnnotationPresent(Titulo.class)) {
                campos++;
            }
        }
        return campos;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        try {
            Object o = lista.get(i);
            for(Method metodo: cl.getDeclaredMethods()) {
                if(metodo.isAnnotationPresent(Titulo.class)){
                    Titulo t = metodo.getAnnotation(Titulo.class);
                    if(t.numeroDaColuna()==i1) {
                        return metodo.invoke(o);
                    }
                }
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    @Override
    public String getColumnName(int i) {
        for(Method m: cl.getDeclaredMethods()) {
            if(m.isAnnotationPresent(Titulo.class)){
                Titulo t = m.getAnnotation(Titulo.class);
                if(t.numeroDaColuna()==i) {
                    return t.nome();
                }
            }
        }
        return null;
    }

    
   

    public List<?> getLista() {
        return lista;
    }
    
    

}
