package com.adani.sih.services;

import com.adani.sih.entities.Userdtls;
import com.adani.sih.exceptions.CustomException;

public interface ServiceAdani {

	void registerService(Userdtls userdtls) throws CustomException;

}
