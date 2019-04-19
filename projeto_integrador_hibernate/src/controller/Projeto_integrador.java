/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Category;
import model.ConexaoHibernate;
import org.hibernate.Session;

/**
 *
 * @author Programador
 */
public class Projeto_integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //metodo para inserir
        Category c = new Category();
        c.setDescription("Salgados");

        Category c1 = new Category();
        c1.setDescription("Bebidas");

        Session db = ConexaoHibernate.getSessionFactory().getCurrentSession();
        db.beginTransaction();
//        db.save(c);
//        db.save(c1);
        System.out.println("Finalizado com Sucesso!");
//        db.getTransaction().commit();

        c.setCode(4);
        c.setDescription("ola");
        db.update(c);
        //metodo para listar
//        List<Category> lista;
//        lista = (List<Category>) db.createQuery("from Category").list();
//        lista.forEach((category) -> {
//            System.out.println(category.getDescription());
//            if (category.getCode() == 2) {
//                db.delete(category);
//            }
//        });
////
//        lista = (List<Category>) db.createQuery("from Category").list();
//        lista.forEach((category) -> {
//            System.out.println(category.getDescription());
//        });
        db.getTransaction().commit();
    }
}
