package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewRegisterRequest extends ViewMaster implements ActionListener {

	public ViewRegisterRequest() {
		createAndShowView();
	}

	private void createAndShowView() {

		setFrameAndPane("Realiza��o de Pedidos",10,10);
		
		addComponentDefaultPane();
		setComponentActionEvent();
		
		frame.setVisible(true);
		
	}
	
	private void addComponentDefaultPane() {

	}

	private void setComponentActionEvent() {

	}

	public void actionPerformed(ActionEvent e) {

	}

}