package com.adani.sih.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.adani.sih.entities.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Long> {

}
