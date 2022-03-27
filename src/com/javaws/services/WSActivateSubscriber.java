package com.javaws.services;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.javaws.dao.UserDao;
import com.javaws.entities.User;

@WebService(name="WSActivateSubscriber",targetNamespace="http://services.activatesubscriber.com")


public class WSActivateSubscriber {

	@WebMethod
	public void creerUserHlr(
			@WebParam(name="nom")String nom,
			@WebParam(name="prenom")String prenom,
			@WebParam(name="nin")String nin,
			@WebParam(name="date_creation")String date_creation,
			@WebParam(name="numero")String numero,
			@WebParam(name="type")String type) throws Exception {
		
		UserDao dao = new UserDao();
		User user = new User(nom, prenom, nin, date_creation, numero, type);
		
		dao.createUserHlr(user);
		
		if(type.equals("PREPAID")){
			WSINConnection wsinconnection = new WSINConnection();
			wsinconnection.creerUserIn(nom, prenom, nin, date_creation, numero, type);
		}else if(type.equals("POSTPAID")){
			System.out.println("C'est un postpaid");
		}else{
			System.out.println("il y'a erreur sur le type !!! ");
		}
		
	}
}
