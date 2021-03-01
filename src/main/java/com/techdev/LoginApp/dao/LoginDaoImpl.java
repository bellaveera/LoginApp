package com.techdev.LoginApp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import org.slf4j.LoggerFactory;

@Repository
public class LoginDaoImpl implements LoginDao {
	
//	private static final Logger log=LoggerFactory.getLogger(LoginDaoImpl.class);


	@Autowired
	private SessionFactory sessionFactory;
	

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public boolean checkLogin(String username, String password) {
		
		//log.debug("entered into doa checkin");
        boolean userfound = false;
		Session session = sessionFactory.openSession();
		String sql="select username, password from userlogin where username=? and password=?";
        Query query=session.createSQLQuery(sql);
	    query.setParameter(1, username);
	    query.setParameter(2, password);
	    List list = query.list();
	    
	    if(list!=null && list.size()>0){
	    	
	    	 userfound = true;
	    	
	    }
	    return userfound;
	}
	
	
	

}
