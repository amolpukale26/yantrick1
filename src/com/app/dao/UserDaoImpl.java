package com.app.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Assets;
import com.app.pojos.Estimation;
import com.app.pojos.Invoice;
import com.app.pojos.New;
import com.app.pojos.Purchase;
import com.app.pojos.Status;
import com.app.pojos.User;
import com.mysql.cj.Query;

@Repository
public class UserDaoImpl implements IUserDao{

	@Autowired
	private SessionFactory sf;
	
	public Integer registerUser(User user) {
		// TODO Auto-generated method stub
		//if(sf.getCurrentSession().createQuery("select u from User u where u.username=:un",User.class).setParameter("un",user.getUsername()).getSingleResult()==null)
		return (Integer)sf.getCurrentSession().save(user);
		//else
		//	return 0;
	}
	
	public Integer addInstall(New newInstall) {
		// TODO Auto-generated method stub
		return (Integer) sf.getCurrentSession().save(newInstall);
	}
	
	public Integer addAssets(Assets asset) {
		// TODO Auto-generated method stub
		return (Integer) sf.getCurrentSession().save(asset);
	}
	
public List<New> getAllInstallations() {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().createQuery("select n from New n",New.class).getResultList();
	}

public List<Assets> getAllAssets() {
	// TODO Auto-generated method stub
	return sf.getCurrentSession().createQuery("select a from Assets a",Assets.class).getResultList();
}

	public Integer addPurchase(Purchase purchase) {
		// TODO Auto-generated method stub
		return (Integer) sf.getCurrentSession().save(purchase);
	}
	
	public List<Purchase> getAllPurchase() {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().createQuery("select p from Purchase p",Purchase.class).getResultList();
	}
	
	public List<Estimation> getAllEstimations() {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().createQuery("select e from Estimation e",Estimation.class).getResultList();
	}
	
	public List<New> getdeleted() {
		// TODO Auto-generated method stub
		Status status=Status.INACTIVE;
		return sf.getCurrentSession().createQuery("select e from New e where e.status=:st",New.class).setParameter("st", status).getResultList();
	}
	
	public List<Invoice> getAllInvoice() {
		// TODO Auto-generated method stub
		return sf.getCurrentSession().createQuery("select i from Invoice i",Invoice.class).getResultList();
	}
	
	public Estimation addnewEstimation(Estimation estimation) {
		// TODO Auto-generated method stub
		  int id=(Integer)sf.getCurrentSession().save(estimation);
		 return sf.getCurrentSession().get(Estimation.class, id);
		
	}
	
	public Invoice addnewInvoice(Invoice invoice) {
		int id=(Integer)sf.getCurrentSession().save(invoice);
		return sf.getCurrentSession().get(Invoice.class,id);
	}
	
	public List<New> search(Date stDate, Date etDate) {
		// TODO Auto-generated method stub
		
		org.hibernate.query.Query q=sf.getCurrentSession().createQuery("select e from New e where  e.status='ACTIVE' and e.date between :st and :et");
		q.setParameter("st", stDate);
		q.setParameter("et", etDate);
	
		return q.getResultList();
//		return sf.getCurrentSession().createQuery("",New.class).setParameter("st", stDate).setParameter("et", etDate).getResultList();;
	}
	
	public Integer delete(int id) {
		// TODO Auto-generated method stub
		
		New new1=sf.getCurrentSession().get(New.class, id);
		new1.setStatus(Status.INACTIVE);
		sf.getCurrentSession().update(new1);
		return 1;
	}
}
