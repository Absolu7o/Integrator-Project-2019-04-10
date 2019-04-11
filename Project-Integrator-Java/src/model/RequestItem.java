package model;

public class RequestItem {

	int code;
	String status;
	int countitem;
	String note;
	char check_requeststart;
	String datetimeins;
	String datetimeupd;
	int code_request;
	int code_item;

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

	public int getCountitem() {
		return countitem;
	}

	public void setCountitem(int countitem) {
		this.countitem = countitem;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public char getCheck_requeststart() {
		return check_requeststart;
	}

	public void setCheck_requeststart(char check_requeststart) {
		this.check_requeststart = check_requeststart;
	}

	public String getDatetimeins() {
		return datetimeins;
	}

	public void setDatetimeins(String datetimeins) {
		this.datetimeins = datetimeins;
	}

	public String getDatetimeupd() {
		return datetimeupd;
	}

	public void setDatetimeupd(String datetimeupd) {
		this.datetimeupd = datetimeupd;
	}

	public int getCode_request() {
		return code_request;
	}

	public void setCode_request(int code_request) {
		this.code_request = code_request;
	}

	public int getCode_item() {
		return code_item;
	}

	public void setCode_item(int code_item) {
		this.code_item = code_item;
	}

}
