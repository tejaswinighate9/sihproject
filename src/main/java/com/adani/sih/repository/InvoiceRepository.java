package com.adani.sih.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adani.sih.entities.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice,String>{

}
