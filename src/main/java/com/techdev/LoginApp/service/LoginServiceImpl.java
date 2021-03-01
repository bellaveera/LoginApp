package com.techdev.LoginApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techdev.LoginApp.dao.LoginDao;


@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginDao logindao;

	@Override
	public boolean checkLogin(String username, String password) {
		// TODO Auto-generated method stub
		return logindao.checkLogin(username,password);
	}
	
	

}
