package controller;

import view.ViewLogin;
import view.ViewRegisterGuestCheck;

public class ControllerMenuSystem extends ControllerMain {

    public void callRegisterGuestCheck() {
        new ViewRegisterGuestCheck();
    }

    public void executeLogout() {
	//Model manda Logout - Log
        
        new ViewLogin();
    }

}
