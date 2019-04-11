package model;

public class Request {

	int code;
	String status;
	String datetimeins;
	String datetimeend;
	float paymoney;
	float paycard;
	String cardtype;
	int code_guestcheck;
	int code_tablelist;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDatetimeins() {
		return datetimeins;
	}

	public void setDatetimeins(String datetimeins) {
		this.datetimeins = datetimeins;
	}

	public String getDatetimeend() {
		return datetimeend;
	}

	public void setDatetimeend(String datetimeend) {
		this.datetimeend = datetimeend;
	}

	public float getPaymoney() {
		return paymoney;
	}

	public void setPaymoney(float paymoney) {
		this.paymoney = paymoney;
	}

	public float getPaycard() {
		return paycard;
	}

	public void setPaycard(float paycard) {
		this.paycard = paycard;
	}

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public int getCode_guestcheck() {
		return code_guestcheck;
	}

	public void setCode_guestcheck(int code_guestcheck) {
		this.code_guestcheck = code_guestcheck;
	}

	public int getCode_tablelist() {
		return code_tablelist;
	}

	public void setCode_tablelist(int code_tablelist) {
		this.code_tablelist = code_tablelist;
	}

}
