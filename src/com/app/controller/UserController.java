package com.app.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.dom4j.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Assets;
import com.app.pojos.Estimation;
import com.app.pojos.Invoice;
import com.app.pojos.New;
import com.app.pojos.Purchase;
import com.app.pojos.Rechargedate;
import com.app.pojos.User;
import com.app.service.IUserService;

@RestController
@RequestMapping("/user")
@CrossOrigin(allowedHeaders = "*")
public class UserController {
	
	@Autowired
	private IUserService service;
	
	public UserController() 
	{
		System.out.println("in usercontroller");
	}
	
	@PostMapping("/register")
	public Integer register(@RequestParam String username,@RequestParam String password,@RequestParam String email,@RequestParam String phone)
	{
		User user=new User(username,password,email,phone);
		System.out.println(user);
//		String msg="successfully registered in stayo "+user.getEmail();
//		SimpleMailMessage mailMessage=new SimpleMailMessage();
//		mailMessage.setTo(user.getEmail());
//		mailMessage.setSubject("registration of stayo");
//		mailMessage.setText(msg);
//		user.setRole(Role.USER);
		if(service.registerUser(user)!=0)
	//	{	mailSender.send(mailMessage);
		{
		return 1;
		}
		else return 0;
		
	}
	@PostMapping("/addinstall")
//	@RequestMapping(value = "/addinstall", method = RequestMethod.POST,consumes ="application/json",  produces="application/json")
	public Integer addInstall(@RequestBody New newInstall)
	{
	//	New newInstall =new New(customerName,address,email,phone,deviceName,IMEI,SIM,price,date);
		System.out.println(newInstall);
		if(service.addInstall(newInstall)!=0)
		{
			return 1;
		}
		else
		return 0;
	}
	
	@PostMapping("/addAssets")
	public Integer addAssets(@RequestBody Assets asset)
	{
		System.out.println(asset);
		return service.addAssets(asset);
	}

	@GetMapping("/getAllInstallations")
	public List<New> getAllInstallations()
	{
		return service.getAllInstallations();
	}
	
	@GetMapping("/getAllAssets")
	public List<Assets> getAllAssets()
	{
		return service.getAllAssets();
	}
	
	@PostMapping("/addPurchase")
	public Integer addPurchase(@RequestBody Purchase purchase)
	{
		System.out.println(purchase);
		return service.addPurchase(purchase);
	}
	
	@GetMapping("/getAllPurchase")
	public List<Purchase> getAllPurchase()
	{
		return service.getAllPurchase();
	}
	
	@GetMapping("/getAllEstimations")
	public List<Estimation> getAllEstimations()
	{
		return service.getAllEstimations();
	}
	
	@GetMapping("/getdeleted")
	public List<New> getdeleted()
	{
		System.out.println(service.getdeleted());
		return service.getdeleted();
	}
	
	@GetMapping("/getAllInvoice")
	public List<Invoice> getAllInvoice()
	{
		return service.getAllInvoice();
	}
	
	@PostMapping("/addnewEstimation")
	public Estimation addnewEstimation(@RequestBody Estimation estimation)
	{
		System.out.println(estimation);
		estimation.setAmount(estimation.getPrice()*estimation.getQty()+(estimation.getPrice()*estimation.getQty()*estimation.getGst()/100));
		return service.addnewEstimation(estimation);
	}
	
	@PostMapping("/addnewinvoice")
	public Invoice addnewInvoice(@RequestBody Invoice invoice)
	{
		System.out.println(invoice);
		invoice.setAmount(invoice.getPrice()*invoice.getQty()+(invoice.getPrice()*invoice.getQty()*invoice.getGst()/100));
		return service.addnewInvoice(invoice);
	}
	
	@PostMapping("/search")
	public List<New> search(@RequestBody Rechargedate rechargedate)
	{
//		System.out.println(stDate);
//		System.out.println(etDate);
		return service.search(rechargedate.getStDate(),rechargedate.getEtDate());
	}
	
	@PostMapping("/delete")
	public Integer delete(@RequestBody Integer installId)
	{
		return service.delete(installId);
	}
	
	
}
