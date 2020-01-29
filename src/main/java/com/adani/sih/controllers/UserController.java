package com.adani.sih.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.adani.sih.entities.LoginDtls;
import com.adani.sih.entities.Userdtls;
import com.adani.sih.exceptions.CustomException;
import com.adani.sih.services.ServiceAdani;

@Controller
public class UserController {

	@Autowired
	ServiceAdani service;

	@RequestMapping("/")
	public String showRegistrationPage() {
		// return "login/registerUser";
		return "index";
	}

	@RequestMapping("/login")
	public String showPage() {
		return "login";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(@RequestParam("firstName") String name, @RequestParam("email") String email,
			@RequestParam("pwd") String pwd, Model model) {
		Userdtls user = new Userdtls();
		LoginDtls loginDtls = new LoginDtls();
		loginDtls.setEmail(email);
		loginDtls.setPwd(pwd);
		user.setFirstName(name);
		user.setEmail(loginDtls);

		try {
			checkRecord(user);
			service.registerService(user);
		} catch (CustomException e) {
			model.addAttribute("errorMsg", e.getMessage());
			return "login";
			// e.printStackTrace();
		}

		System.out.println("Name" + name);
		System.out.println("email" + email);
		System.out.println("pwd" + pwd);
		return "login";
	}

	public void checkRecord(Userdtls userDtls) throws CustomException {
		if (userDtls.getFirstName().isEmpty())
			throw new CustomException("First Name cannot be Empty");
		else if (userDtls.getEmail().getEmail().isEmpty())
			throw new CustomException("Email cannot be Empty");
		else if (userDtls.getEmail().getPwd().isEmpty())
			throw new CustomException("Password cannot be Empty");

	}
}
