package com.adani.sih.services;

import java.lang.annotation.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adani.sih.entities.LoginDtls;
import com.adani.sih.entities.Userdtls;
import com.adani.sih.exceptions.CustomException;
import com.adani.sih.repository.LogindtlsRepository;
import com.adani.sih.repository.UserdtlsRepository;

@Service
public class ServiceImpl implements ServiceAdani {

	@Autowired UserdtlsRepository userdtlsRepository;
	@Autowired LogindtlsRepository logindtlsRepository;
	
	public void registerService(Userdtls userdtls) throws CustomException
	{
		LoginDtls loginDtls = logindtlsRepository.findByEmail(userdtls.getEmail().getEmail());
		if(loginDtls!=null)
			throw new CustomException("Email already exist");
			
		userdtlsRepository.save(userdtls);
	}
	
}
