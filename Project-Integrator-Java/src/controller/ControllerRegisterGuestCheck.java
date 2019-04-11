package controller;

import dao.DaoGuestCheck;
import model.GuestCheck;

public class ControllerRegisterGuestCheck {

	DaoGuestCheck daoGuestCk = new DaoGuestCheck();
	
	public GuestCheck findGuestCheck(int code) {
		return daoGuestCk.findGuestCheck(code);
	}
	
}
