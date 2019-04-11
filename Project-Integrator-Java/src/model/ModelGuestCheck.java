package model;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.DaoGuestCheck;


public class ModelGuestCheck extends ModelMaster {

	public DaoGuestCheck findGuestCheck(int code) {
		
		ResultSet rs;
		DaoGuestCheck guestCheck = new DaoGuestCheck();
		
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
