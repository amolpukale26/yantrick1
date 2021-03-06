package com.app.pojos;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "new")
public class New {
	private Integer installId;
	private String customerName,address,email,phone,deviceName,imei,sim;
	private float price,recharge;
	private Date date;
	private Status status;
	
	public New() {
		System.out.println("in new");
		// TODO Auto-generated constructor stub
	}

	public New(Integer installId, String customerName, String address, String email, String phone, String deviceName,
			String imei, String sim, float price, float recharge, Date date, Status status) {
		super();
		this.installId = installId;
		this.customerName = customerName;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.deviceName = deviceName;
		this.imei = imei;
		this.sim = sim;
		this.price = price;
		this.recharge = recharge;
		this.date = date;
		this.status = status;
	}



	public New(String customerName, String address, String email, String phone, String deviceName, String imei,
			String sim, float price, float recharge, Date date, Status status) {
		super();
		this.customerName = customerName;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.deviceName = deviceName;
		this.imei = imei;
		this.sim = sim;
		this.price = price;
		this.recharge = recharge;
		this.date = date;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getInstallId() {
		return installId;
	}

	public void setInstallId(Integer installId) {
		this.installId = installId;
	}

	public String getCustomerName() {
		return customerName;
	}

	@Enumerated(EnumType.STRING)
	@Column(length=20)
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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

	public float getRecharge() {
		return recharge;
	}


	public void setRecharge(float recharge) {
		this.recharge = recharge;
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

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getSim() {
		return sim;
	}

	public void setSim(String sim) {
		this.sim = sim;
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
		return "New [customerName=" + customerName + ", address=" + address + ", email=" + email + ", phone=" + phone
				+ ", deviceName=" + deviceName + ", imei=" + imei + ", sim=" + sim + ", price=" + price + ", date="
				+ date + "]";
	}
	
	
}
