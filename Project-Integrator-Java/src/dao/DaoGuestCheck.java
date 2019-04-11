package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.GuestCheck;


public class DaoGuestCheck extends DaoMaster {

	public GuestCheck findGuestCheck(int code) {
		
		ResultSet rs;
		GuestCheck guestCheck = new GuestCheck();
		
		try {
			openConnection();
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select code,barcode,active from guestcheck where (code=" + code + ")");

			if (rs.next()) {
				guestCheck.setCode(rs.getInt(1));
				guestCheck.setBarcode(rs.getString(2));
				guestCheck.setActive(rs.getString(3));
			}
			
			closeConnection();
			return guestCheck;

		} catch (SQLException e) {
			closeConnection();
			System.out.println("ERRO SQL");
			return guestCheck;
		}
	}
}
