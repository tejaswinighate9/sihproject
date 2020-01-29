package com.adani.sih.services;

import org.springframework.stereotype.Service;

import com.adani.sih.entities.LoginDtls;


public interface ServiceAdani {
	
	LoginDtls getLoginDetails(LoginDtls logindtls);

}
