package com.techdev.LoginApp.controllers;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.techdev.LoginApp.model.UserLogin;
import com.techdev.LoginApp.model.UserRegister;
import com.techdev.LoginApp.service.LoginService;
import com.techdev.LoginApp.service.RegisterService;

@Controller
@RequestMapping("/veera")
public class LoginController {

	// private static final Logger
	// log=LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LoginService loginservice;

	@Autowired
	private RegisterService registerService;

	@GetMapping("/login")
	public String getHome() {
		return "login";
	}

	@GetMapping("/register.html")
	public String getRegisterPage() {
		return "register";
	}

	@GetMapping("/check")
	public ModelAndView processCredentials(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		// log.debug("enter into checking method");
		UserLogin user = new UserLogin();
		user.setUsername(username);
		user.setPassword(password);

		boolean result = loginservice.checkLogin(username, password);
		if (result) {

			ModelAndView mv = new ModelAndView("home");

			mv.addObject("msg", user.getUsername());
			System.out.println(user.getUsername());
			return mv;
		} else {
			ModelAndView model = new ModelAndView("login");
			return model;
		}

	}

	@PostMapping("/register")
	public String registerDetails(@ModelAttribute("userRegister") UserRegister user, Model model) {

		System.out.println(user.getEmail() + " " + user.getUsername());
		registerService.checkDetails(user);
		System.out.println("executing controller method");
		model.addAttribute("msg", "registration succeessful");
		return "success";

	}
}
