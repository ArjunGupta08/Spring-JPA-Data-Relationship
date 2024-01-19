package com.ag.Spring.Data.JPA.Mapping.repository;

import com.ag.Spring.Data.JPA.Mapping.entity.Category;
import org.hibernate.sql.ast.tree.expression.JdbcParameter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
