package com.app.pojos;

import java.util.Date;

public class Rechargedate {
	Date stDate;
	Date etDate;
	
	public Rechargedate() {
		// TODO Auto-generated constructor stub
	}

	public Rechargedate(Date stDate, Date etDate) {
		super();
		this.stDate = stDate;
		this.etDate = etDate;
	}

	public Date getStDate() {
		return stDate;
	}

	public void setStDate(Date stDate) {
		this.stDate = stDate;
	}

	public Date getEtDate() {
		return etDate;
	}

	public void setEtDate(Date etDate) {
		this.etDate = etDate;
	}
	
	

}
