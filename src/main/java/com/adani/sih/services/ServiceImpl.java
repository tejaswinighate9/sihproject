package com.adani.sih.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adani.sih.entities.LoginDtls;
import com.adani.sih.repository.LogindtlsRepository;

@Service
@Transactional(rollbackFor=Throwable.class)
public class ServiceImpl implements com.adani.sih.services.ServiceAdani{
	
	@Autowired
	LogindtlsRepository loginrepository;

	@Override
	public LoginDtls getLoginDetails(LoginDtls logindtls) {
		
		return loginrepository.findByEmail(logindtls.getEmail());
	}
	
	

}
