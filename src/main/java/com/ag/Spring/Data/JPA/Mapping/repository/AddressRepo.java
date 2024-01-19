package com.ag.Spring.Data.JPA.Mapping.repository;

import com.ag.Spring.Data.JPA.Mapping.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address, Integer> {

}
