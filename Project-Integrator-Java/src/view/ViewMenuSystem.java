package view;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViewMenuSystem extends ViewMaster {

	JButton buttonProgram1 = new JButton("Programa 1");
	JButton buttonProgram2 = new JButton("Programa 2");
	JButton buttonProgram3 = new JButton("Programa 3");

	public ViewMenuSystem() {

		setFrameAndPane("Menu Principal",1,3);
		
		pane.add(buttonProgram1, setGridBagConstraints(0, 0, 1, 1, "BOTH"));
		pane.add(buttonProgram2, setGridBagConstraints(1, 0, 1, 1, "BOTH"));
		pane.add(buttonProgram3, setGridBagConstraints(2, 0, 1, 1, "BOTH"));

		setButtonFunction();
		
		frame.setVisible(true);


	}

	private void setButtonFunction() {

		// Aqui são definidas funções de Clicks, cada botão deve chamar um program 
		// na'ControllerMaster'
		buttonProgram1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new ViewRegisterGuestCheck();
			}
		});

		buttonProgram2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});

		buttonProgram3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub

			}
		});
	}

}
