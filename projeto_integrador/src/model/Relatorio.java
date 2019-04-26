/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.InputStream;
import java.util.List;

import model.Category;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


/**
 *
 * @author Programador
 */
public class Relatorio {
    public void gerarRelatorioLogin( List<Category> lista) throws JRException{
        InputStream fonte = Relatorio.class.getResourceAsStream("/report/relatorioLogin.jrxml");
        JasperReport report = JasperCompileManager.compileReport(fonte);
        JasperPrint print = JasperFillManager.fillReport(report, null,new JRBeanCollectionDataSource(lista));
        JasperViewer.viewReport(print,false);
    }
    public void gerarRelatorioSynthetic( List<Userlog> lista) throws JRException{
        InputStream fonte = Relatorio.class.getResourceAsStream("/report/ReportUserLogSynthetic.jrxml");
        JasperReport report = JasperCompileManager.compileReport(fonte);
        JasperPrint print = JasperFillManager.fillReport(report, null,new JRBeanCollectionDataSource(lista));
        JasperViewer.viewReport(print,false);
    }
    
    
}
