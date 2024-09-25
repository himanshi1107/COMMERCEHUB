package com.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
