///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package controller;
//
//import java.util.Date;
//import java.util.List;
//import model.Category;
//import model.ConexaoHibernate;
//import model.Userlog;
//import model.Userlogin;
//import model.Userpermission;
//import org.hibernate.Session;
//
///**
// *
// * @author Programador
// */
//public class Projeto_integrador {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//        //metodo para inserir
//        Category c = new Category();
//        c.setDescription("Salgados");
//
//        Category c1 = new Category();
//        c1.setDescription("Bebidas");
//
//        Userlogin2 us = new Userlogin2();
//        us.setName("Roh");
//        us.setLogin("roh");
//        us.setPassword("teste");
//
//        Userpermission usp = new Userpermission();
//        usp.setCashier('S');
//        usp.setAttendant('S');
//        
//        Userlog objUserlog = new Userlog();
//
//        Session db = ConexaoHibernate.getSessionFactory().getCurrentSession();
//        db.beginTransaction();
////        db.save(us);
////        db.save(c1);
//        System.out.println("Finalizado com Sucesso!");
////        db.getTransaction().commit();
//
////        c.setCode(4);
////        c.setDescription("ola");
////        db.update(c);
//        //metodo para listar
////        List<Category> lista;
//        List<Userlogin2> lista;
//        lista = (List<Userlogin2>) db.createQuery("from Userlogin where login ='" + us.getLogin() + "' AND password='" + us.getPassword() + "'").list();
////        lista.
////        System.out.println(us.getCode());
////        System.out.println(us.getName());
////        System.out.println(us.getUserpermission());
////        System.out.println(us.getUserlog());
//        lista.forEach((userlogin) -> {
////            System.out.println(userlogin.getUserpermission().getCode());
////            usp.setUserlogin(userlogin);
////            System.out.println(userlogin.getCode());
////            System.out.println(userlogin.getName());
////            System.out.println(userlogin.getUserpermission().getAttendant());
////            System.out.println(userlogin.getUserpermission().getCashier());
//            objUserlog.setDatetimeins(new Date());
//            objUserlog.setLogtype("Login");
//            objUserlog.setUserlogin(userlogin);
//            db.save(objUserlog);
//            System.out.println("Sucesso");
//        });
////        System.out.println(usp.getCode());
////        db.saveOrUpdate(usp);
//////
////        lista = (List<Category>) db.createQuery("from Category").list();
////        lista.forEach((category) -> {
////            System.out.println(category.getDescription());
////        });
//        db.getTransaction().commit();
//    }
//
//}
