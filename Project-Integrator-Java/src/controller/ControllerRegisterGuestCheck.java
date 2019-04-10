package controller;

import dao.DaoGuestCheck;
import model.ModelGuestCheck;

public class ControllerRegisterGuestCheck {

	ModelGuestCheck modelGuestCk = new ModelGuestCheck();
	
	public DaoGuestCheck findGuestCheck(int code) {
		return modelGuestCk.findGuestCheck(code);
	}
	
}
