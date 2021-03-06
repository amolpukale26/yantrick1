package com.app.pojos;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "asset")
public class Assets {
	private Integer assetsId,petrol,wages,software,simCards,salary;
	private Date date;
	
	public Assets() {
	System.out.println("in assets");
		// TODO Auto-generated constructor stub
	}

	public Assets(Integer petrol, Integer wages, Integer software, Integer simCards, Integer salary, Date date) {
		super();
		this.petrol = petrol;
		this.wages = wages;
		this.software = software;
		this.simCards = simCards;
		this.salary = salary;
		this.date = date;
	}

	public Assets(Integer assetsId, Integer petrol, Integer wages, Integer software, Integer simCards, Integer salary,
			Date date) {
		super();
		this.assetsId = assetsId;
		this.petrol = petrol;
		this.wages = wages;
		this.software = software;
		this.simCards = simCards;
		this.salary = salary;
		this.date = date;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getAssetsId() {
		return assetsId;
	}

	public void setAssetsId(Integer assetsId) {
		this.assetsId = assetsId;
	}

	public Integer getPetrol() {
		return petrol;
	}

	public void setPetrol(Integer petrol) {
		this.petrol = petrol;
	}

	public Integer getWages() {
		return wages;
	}

	public void setWages(Integer wages) {
		this.wages = wages;
	}

	public Integer getSoftware() {
		return software;
	}

	public void setSoftware(Integer software) {
		this.software = software;
	}

	public Integer getSimCards() {
		return simCards;
	}

	public void setSimCards(Integer simCards) {
		this.simCards = simCards;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Assets [petrol=" + petrol + ", wages=" + wages + ", software=" + software + ", simCards=" + simCards
				+ ", salary=" + salary + ", date=" + date + "]";
	}
	

}
