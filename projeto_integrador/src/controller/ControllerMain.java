package controller;

import hibernate.ConnectHibernate;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;
import model.Relatorio;
import model.Userlog;
import model.Userlogin;
import model.Userpermission;
import net.sf.jasperreports.engine.JRException;
import org.hibernate.Session;
import view.ViewLogin;
import view.ViewMaster;

public class ControllerMain {

    static Session db = ConnectHibernate.getSessionFactory().getCurrentSession();

    public static void main(String[] args) {
        // TODO code application logic here
        //metodo para inserir
        Category c = new Category();
        c.setDescription("Salgados");

        Category c1 = new Category();
        c1.setDescription("Bebidas");

        Userlogin us = new Userlogin();
        us.setName("Roh");
        us.setLogin("roh");
        us.setPassword("teste");

        Userpermission usp = new Userpermission();
        usp.setCashier('S');
        usp.setAttendant('S');

        Userlog objUserlog = new Userlog();

        Session db = ConnectHibernate.getSessionFactory().getCurrentSession();
        db.beginTransaction();
//        db.save(us);
//        db.save(c1);
        System.out.println("Finalizado com Sucesso!");
//        db.getTransaction().commit();

//        c.setCode(4);
//        c.setDescription("ola");
//        db.update(c);
        //metodo para listar
//        List<Category> lista;
        List<Userlog> lista;
//        lista = (List<Category>) db.createQuery("from Category where login ='" + us.getLogin() + "' AND password='" + us.getPassword() + "'").list();
        lista = (List<Userlog>) db.createQuery("from Userlog").list();
//        lista.
//        System.out.println(us.getCode());
//        System.out.println(us.getName());
//        System.out.println(us.getUserpermission());
//        System.out.println(us.getUserlog());
//        lista.forEach((userlog) -> {
//            System.out.println(userlogin.getUserpermission().getCode());
//            usp.setUserlogin(userlogin);
//            System.out.println(userlogin.getCode());
//            System.out.println(userlogin.getName());
//            System.out.println(userlogin.getUserpermission().getAttendant());
//            System.out.println(userlogin.getUserpermission().getCashier());
//            objUserlog.setDatetimeins(new Date());
//            objUserlog.setLogtype("Login");
//            objUserlog.setUserlogin(userlogin);
//            db.save(objUserlog);
//            System.out.println(userlog.getCode());
//        });
//        System.out.println(usp.getCode());
//        db.saveOrUpdate(usp);
////
//        lista = (List<Category>) db.createQuery("from Category").list();
//        lista.forEach((category) -> {
//            System.out.println(category.getDescription());
//        });

        Relatorio relatorio = new Relatorio();

        try {
            relatorio.gerarRelatorioSynthetic(lista);
        } catch (JRException ex) {
            Logger.getLogger(ControllerMain.class.getName()).log(Level.SEVERE, null, ex);
        }
//        ViewMaster.setConstraints();
//        new ViewLogin();
        db.getTransaction().commit();
    }

}
