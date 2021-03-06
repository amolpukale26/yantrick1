package com.app.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "invoice")
public class Invoice {
	private Integer invoiceId,qty;
	private String customerName,address,email,phone,deviceName,description,unit,activity;
	private float price,amount,gst;
	private Date date;
	
	public Invoice() {
		// TODO Auto-generated constructor stub
	}

	public Invoice(Integer qty, String customerName, String address, String email, String phone, String deviceName,
			String description, String unit, String activity, float price, float amount, float gst, Date date) {
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
		this.price = price;
		this.amount = amount;
		this.gst = gst;
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Integer invoiceId) {
		this.invoiceId = invoiceId;
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

	public String getDescription() {
		return description;
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

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
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

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", qty=" + qty + ", customerName=" + customerName + ", address="
				+ address + ", email=" + email + ", phone=" + phone + ", deviceName=" + deviceName + ", description="
				+ description + ", unit=" + unit + ", activity=" + activity + ", price=" + price + ", amount=" + amount
				+ ", gst=" + gst + ", date=" + date + "]";
	}
	
	

}
