package com.app.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.pojos.Assets;
import com.app.pojos.Estimation;
import com.app.pojos.Invoice;
import com.app.pojos.New;
import com.app.pojos.Purchase;
import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao dao;
	
	public Integer registerUser(User user) {
		// TODO Auto-generated method stub
		return dao.registerUser(user);
	}
	public Integer addInstall(New newInstall) {
		// TODO Auto-generated method stub
		return dao.addInstall(newInstall);
	}

	public List<New> getAllInstallations() {
		// TODO Auto-generated method stub
		return dao.getAllInstallations();
	}
	
	public Integer addAssets(Assets asset) {
		// TODO Auto-generated method stub
		return dao.addAssets(asset);	
	}
	
	public List<Assets> getAllAssets() {
		// TODO Auto-generated method stub
		return dao.getAllAssets();
	}
	
	public Integer addPurchase(Purchase purchase) {
		// TODO Auto-generated method stub
		return dao.addPurchase(purchase);
	}
	
	public List<Purchase> getAllPurchase() {
		// TODO Auto-generated method stub
		return dao.getAllPurchase();
	}
	
	public List<Estimation> getAllEstimations() {
		// TODO Auto-generated method stub
		return dao.getAllEstimations();
	}
	
	public List<Invoice> getAllInvoice() {
		// TODO Auto-generated method stub
		return dao.getAllInvoice();
	}
	
	public Estimation addnewEstimation(Estimation estimation) {
		// TODO Auto-generated method stub
		return dao.addnewEstimation(estimation);
	}
	
	public Invoice addnewInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		return dao.addnewInvoice(invoice);
	}
	
	public List<New> search(Date stDate, Date etDate) {
		// TODO Auto-generated method stub
		return dao.search(stDate,etDate);
	}
	public Integer delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}
	public List<New> getdeleted() {
		// TODO Auto-generated method stub
		return dao.getdeleted();
	}
}
