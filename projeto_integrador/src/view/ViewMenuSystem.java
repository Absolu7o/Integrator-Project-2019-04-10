package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

import controller.ControllerMenuSystem;

public class ViewMenuSystem extends ViewMaster implements ActionListener {

    ControllerMenuSystem controllerMenuSystem = new ControllerMenuSystem();

    JMenuBar menubar = new JMenuBar();
    JMenu optionMenu = new JMenu("Opções");
    JMenuItem logoutMenu = new JMenuItem("Logout");
    JMenu preferences = new JMenu("Preferências");
    JMenu setTheme = new JMenu("Tema");
    JMenu setColor = new JMenu("Cor em Destaque");

    ButtonGroup groupTheme = new ButtonGroup();
    JRadioButtonMenuItem lighTheme = new JRadioButtonMenuItem("Claro");
    JRadioButtonMenuItem darkTheme = new JRadioButtonMenuItem("Escuro");

    ButtonGroup groupColor = new ButtonGroup();
    JRadioButtonMenuItem colorBlue = new JRadioButtonMenuItem("Azul");
    JRadioButtonMenuItem colorGreen = new JRadioButtonMenuItem("Verde");
    JRadioButtonMenuItem colorYellow = new JRadioButtonMenuItem("Amarelo");
    JRadioButtonMenuItem colorOrange = new JRadioButtonMenuItem("Laranja");
    JRadioButtonMenuItem colorRed = new JRadioButtonMenuItem("Vermelho");

    JButton buttonRegisterGuestCheck = new JButton("Cadastro de Comandas");
    JButton buttonReportUserLog = new JButton("Relatório User Log");
    JButton buttonProgram3 = new JButton();

    public ViewMenuSystem() {
        createAndShowGUI();
    }

    private void createAndShowGUI() {

        setFrameAndPane("Menu Principal", 6, 5);
        addMenubarItem();

        addComponentDefaultPane();
        setComponentActionEvent();

        menubar.setVisible(true);
        frame.setVisible(true);

    }

    public void addComponentDefaultPane() {

        buttonRegisterGuestCheck = setDefaultButton(buttonRegisterGuestCheck, 0, 0, 2, 5, "BOTH");
        buttonReportUserLog = setDefaultButton(buttonReportUserLog, 2, 0, 2, 5, "BOTH");
        buttonProgram3 = setDefaultButton(buttonProgram3, 4, 0, 2, 5, "BOTH");

    }

    private void addMenubarItem() {

        frame.setJMenuBar(menubar);
        menubar.setOpaque(false);

        //Opções
        menubar.add(optionMenu);
        optionMenu.add(preferences);
        preferences.add(setTheme);
        preferences.add(setColor);
        setTheme.add(lighTheme);
        setTheme.add(darkTheme);
        setColor.add(colorBlue);
        setColor.add(colorGreen);
        setColor.add(colorYellow);
        setColor.add(colorOrange);
        setColor.add(colorRed);
        groupTheme.add(lighTheme);
        groupTheme.add(darkTheme);
        lighTheme.setSelected(true);
        groupColor.add(colorBlue);
        groupColor.add(colorGreen);
        groupColor.add(colorYellow);
        groupColor.add(colorOrange);
        groupColor.add(colorRed);
        colorOrange.setSelected(true);

        //Logout
        menubar.add(logoutMenu);

    }

    private void setComponentActionEvent() {

        buttonRegisterGuestCheck.addActionListener(this);
        buttonReportUserLog.addActionListener(this);
        buttonProgram3.addActionListener(this);

        logoutMenu.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == buttonRegisterGuestCheck) {
            controllerMenuSystem.callRegisterGuestCheck();
        } else if (e.getSource() == buttonReportUserLog) {
            //Montar Relatório
        } else if (e.getSource() == logoutMenu) {
            menubar.setVisible(false);
            frame.remove(menubar);
            controllerMenuSystem.executeLogout();
        }

    }

}
