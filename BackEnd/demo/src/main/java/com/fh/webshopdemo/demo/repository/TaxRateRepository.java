package com.fh.webshopdemo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fh.webshopdemo.demo.model.TaxRate;

@Repository
public interface TaxRateRepository extends JpaRepository<TaxRate, Long> {
  
}
