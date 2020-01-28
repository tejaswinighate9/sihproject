package com.adani.sih.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adani.sih.entities.Invoice;
import com.adani.sih.entities.TransClassId;
import com.adani.sih.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction,TransClassId> {

}
