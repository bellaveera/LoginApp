package com.techdev.LoginApp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techdev.LoginApp.model.UserRegister;
@Repository
public class RegisterDaoImpl implements RegisterDao {

	@Autowired
	private SessionFactory sessionFactory;

	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

    @Override
	public void saveDetails(UserRegister user) {
    	
    	System.out.println("entered into dao class");
		 Session session = sessionFactory.openSession();
	Transaction tx=	session.beginTransaction(); 
         session.save(user);
         System.out.println(user.getPh_no());
         tx.commit();
         session.close();
				
	}

	


}
