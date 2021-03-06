package com.app.dao;

import java.util.Date;
import java.util.List;

import com.app.pojos.Assets;
import com.app.pojos.Estimation;
import com.app.pojos.Invoice;
import com.app.pojos.New;
import com.app.pojos.Purchase;
import com.app.pojos.User;

public interface IUserDao {
	public Integer registerUser(User user);
	public Integer addInstall(New newInstall);
	public List<New> getAllInstallations();
	public Integer addAssets(Assets asset);
	public List<Assets> getAllAssets();
	public Integer addPurchase(Purchase purchase);
	public List<Purchase> getAllPurchase();
	public List<Estimation> getAllEstimations();
	public Estimation addnewEstimation(Estimation estimation);
	public Invoice addnewInvoice(Invoice invoice);
	public List<Invoice> getAllInvoice();
	public List<New> search(Date stDate, Date etDate);
	public Integer delete(int id);
	public List<New> getdeleted(); 
}
