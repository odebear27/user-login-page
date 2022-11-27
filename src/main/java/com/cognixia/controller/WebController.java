package com.cognixia.controller;


import java.io.IOException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cognixia.model.Login;
import com.cognixia.model.UserInfo;
import com.cognixia.service.LoginService;

@RestController
public class WebController {
	
	public static String usernameString;
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/login")
	public ModelAndView showLogin(Login login) throws IOException {
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("login.html");
	    return modelAndView;
	}
	
	@PostMapping("/login")
	public ModelAndView checkLoginInfo(@Valid UserInfo userInfo, BindingResult bindingResult, Login login) {
		if (bindingResult.hasErrors() || loginService.getUser(userInfo) == null) {
			ModelAndView modelAndView = new ModelAndView();
		    modelAndView.setViewName("login.html");
		    return modelAndView;
		}
		
		loginService.addLogin(login);
		usernameString = userInfo.getUsername();
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("fileUpload.html");
	    return modelAndView;
	}
	
	
//	@PostMapping("/login")
//	public String addLogin(Login login) {
//		
//		loginService.addLogin(login);
//		return "fileUpload";
//	}

}
