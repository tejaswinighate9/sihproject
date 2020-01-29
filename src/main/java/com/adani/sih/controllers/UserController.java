package com.adani.sih.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.adani.sih.Utils.EmailUtil;
import com.adani.sih.entities.LoginDtls;
import com.adani.sih.services.ServiceAdani;




@Controller
public class UserController {
	
	@Autowired
	ServiceAdani service;
	
	@Autowired
	EmailUtil emailUtil;
	
	@RequestMapping("/index")
	public String showRegistrationPage()
	{
		//return "login/registerUser";
		return "index";
	}
	
	@RequestMapping("/login")
	public String showLoginPage()
	{
		//return "login/registerUser";
		return "login";
	}
	
	@RequestMapping("/userentry")
	public String PerformLogin(@RequestParam("email")String email,@RequestParam("pwd")String pwd, ModelMap modelMap)/*@ModelAttribute("logindtls") LoginDtls logindtls*/
	{
		LoginDtls logindtls=new LoginDtls();
		logindtls.setEmail(email);
		logindtls.setPwd(pwd);
		LoginDtls loginDone = service.getLoginDetails(logindtls);
		String msg = "User saved: " + loginDone.getEmail();
		modelMap.addAttribute("msg", msg);
		emailUtil.sendEmail("springteja123@gmail.com", "Logged in","Logged in successfully in adani website with username "+logindtls.getEmail());
//		return "createLocation";
		return "adanicustomer";

	}
	

}
