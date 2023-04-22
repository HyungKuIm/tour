package com.oraclejava.tour.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oraclejava.tour.model.Reserve;

public interface ReserveRepository
	extends JpaRepository<Reserve, Integer>{

}
