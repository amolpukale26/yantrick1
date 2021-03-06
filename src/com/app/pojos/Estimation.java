package com.app.pojos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estimate")
public class Estimation {
	private Integer estimateId,qty;
	private String customerName,address,email,phone,deviceName,description,unit,activity,gstin;
	private float price,amount,gst;
	private Date date;
	
	public Estimation() {
	System.out.println("in estimation");
		// TODO Auto-generated constructor stub
	}

	public Estimation(Integer qty, String customerName, String address, String email, String phone, String deviceName,
			String description, String unit, String activity, String gstin, float price, float amount, float gst,
			Date date) {
		super();
		this.qty = qty;
		this.customerName = customerName;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.deviceName = deviceName;
		this.description = description;
		this.unit = unit;
		this.activity = activity;
		this.gstin = gstin;
		this.price = price;
		this.amount = amount;
		this.gst = gst;
		this.date = date;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getEstimateId() {
		return estimateId;
	}

	public void setEstimateId(Integer estimateId) {
		this.estimateId = estimateId;
	}

	public String getDescription() {
		return description;
	}
	
	public String getActivity() {
		return activity;
	}



	public String getGstin() {
		return gstin;
	}

	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}



	public void setDescription(String description) {
		this.description = description;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}


	public float getAmount() {
		return amount;
	}


	public void setAmount(float amount) {
		this.amount = amount;
	}


	public float getGst() {
		return gst;
	}


	public void setGst(float gst) {
		this.gst = gst;
	}


	public Integer getQty() {
		return qty;
	}

	public void setQty(Integer qty) {
		this.qty = qty;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(length = 20)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "Estimation [estimateId=" + estimateId + ", qty=" + qty + ", customerName=" + customerName + ", address="
				+ address + ", email=" + email + ", phone=" + phone + ", deviceName=" + deviceName + ", description="
				+ description + ", unit=" + unit + ", activity=" + activity + ", price=" + price + ", amount=" + amount
				+ ", gst=" + gst + ", date=" + date + "]";
	}


	
	
}
