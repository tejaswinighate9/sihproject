package com.adani.sih.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adani.sih.entities.Userdtls;

@Repository
public interface UserdtlsRepository extends JpaRepository<Userdtls,Long>{

}
