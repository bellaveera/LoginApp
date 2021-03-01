package com.techdev.LoginApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techdev.LoginApp.dao.RegisterDao;
import com.techdev.LoginApp.model.UserRegister;
@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	private RegisterDao registerdao;

	@Override
	public void checkDetails(UserRegister user) {
     System.out.println("entered into service class");
		registerdao.saveDetails(user);
	}

}
