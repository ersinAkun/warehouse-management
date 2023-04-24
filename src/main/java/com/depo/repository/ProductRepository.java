package com.depo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.depo.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Long, Product>{

}