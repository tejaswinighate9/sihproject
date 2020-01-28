package com.adani.sih.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adani.sih.entities.Transactiondtls;

@Repository
public interface TransactiondtlsRepository extends JpaRepository<Transactiondtls,Long> {

}
