package com.adani.sih.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adani.sih.entities.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long>{

}
