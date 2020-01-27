package com.adani.sih.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adani.sih.entities.Invoice;


public interface InvoiceRepository extends JpaRepository<Invoice,String>{

}
