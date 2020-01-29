package com.adani.sih.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adani.sih.entities.LoginDtls;

@Repository
public interface LogindtlsRepository extends JpaRepository<LoginDtls,String>{

	LoginDtls findByEmail(String email);

}
