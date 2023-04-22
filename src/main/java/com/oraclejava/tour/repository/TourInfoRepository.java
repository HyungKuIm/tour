package com.oraclejava.tour.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oraclejava.tour.model.TourInfo;

public interface TourInfoRepository
	extends JpaRepository<TourInfo, Integer>, 
			TourInfoCustom{

}
