package com.techprimers.stock.dbservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.stock.dbservice.model.Quote;

public interface QuotesRepository extends JpaRepository<Quote, Integer>{
	List<Quote> findByUserName(String username);
}
