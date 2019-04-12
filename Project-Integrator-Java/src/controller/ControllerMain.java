package controller;

import view.ViewMenuSystem;
import view.ViewRegisterGuestCheck;

public class ControllerMain {

	public static void main(String[] args) {

		//Classe adicionara Barra de Opções e Chamara todas as view.
		ViewRegisterGuestCheck.setConstraints();
		System.out.println("Vai");
		new ViewMenuSystem();
						
	}
	
}
