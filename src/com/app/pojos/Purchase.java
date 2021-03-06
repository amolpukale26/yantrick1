package com.app.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "purchase")
public class Purchase {

	private Integer purchaseId;
	private String companyName,productName;
	private float price;
	private Date date;
	
	public Purchase() {
	System.out.println("in purchase");
		// TODO Auto-generated constructor stub
	}

	public Purchase(String companyName, String productName, float price, Date date) {
		super();
		this.companyName = companyName;
		this.productName = productName;
		this.price = price;
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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
		return "Purchase [companyName=" + companyName + ", productName=" + productName + ", price=" + price + ", date="
				+ date + "]";
	}
	
}
