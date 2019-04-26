package controller;

import hibernate.ConnectHibernate;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.Systemview;
import model.Userlog;
import model.Userlogin;
import org.hibernate.Query;
import org.hibernate.Session;

import view.ViewMenuSystem;

public class ControllerLogin extends ControllerMain {

    public void executeLogin(String login, String password) {

        Userlogin userlogin = new Userlogin();
        Userlog userlog = new Userlog();
        List<Userlogin> list;

        db.beginTransaction();
        list = (List<Userlogin>) db.createQuery("from Userlogin where (login='" + login + "') and (password='" + password + "')").list();
        list.forEach((userLogin) -> {
            userlogin.setCode(userLogin.getCode());
            userlog.setDatetimeins(new Date());
            userlog.setLogtype("Login");
            userlog.setSystemview(new Systemview(1));
            userlog.setUserlogin(userLogin);
        });

        if (userlogin.getCode() > 0) {
            db.save(userlog);
            new ViewMenuSystem();
        } else {
            JOptionPane.showMessageDialog(null, "Login e/ou Senha est�o incorretos!");
        }
        db.getTransaction().commit();

        //db.getTransaction();
    }

}
