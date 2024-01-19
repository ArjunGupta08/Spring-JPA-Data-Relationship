package com.ag.Spring.Data.JPA.Mapping.repository;

import com.ag.Spring.Data.JPA.Mapping.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepo extends JpaRepository<Emp, Integer> {

}
