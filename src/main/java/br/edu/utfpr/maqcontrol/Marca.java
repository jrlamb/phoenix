package br.edu.utfpr.maqcontrol;

/***********************************************************************
 * Module:  Marca.java
 * Author:  Juliano
 * Purpose: Defines the Class Marca
 ***********************************************************************/

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="marca", catalog="maqcontrol")
public class Marca {
   @Id 
   @GeneratedValue(strategy=IDENTITY)
   @Column(name = "id", unique = true, nullable = false)
   private int id;
   
   @Column(name = "descricao", length = 50)
   private String descricao;
   
   public Marca() {
      // TODO: implement
   }

    public Marca(String descricao) {
        this.descricao = descricao;
    }
   
   

}