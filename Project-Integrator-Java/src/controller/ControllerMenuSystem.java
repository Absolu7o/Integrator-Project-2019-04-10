package controller;

import view.ViewMenuSystem;
import view.ViewRegisterCategory;
import view.ViewRegisterGuestCheck;
import view.ViewRegisterTlabeList;

public class ControllerMenuSystem {

	public static void main(String[] args) {

		//Chamar apenas uma vez
		ViewRegisterGuestCheck.setConstraints();
		System.out.println("Vai");
		new ViewMenuSystem();
						
	}
	
}
