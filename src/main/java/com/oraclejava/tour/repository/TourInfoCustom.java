package com.oraclejava.tour.repository;

import java.util.List;

import com.oraclejava.tour.model.TourInfo;

//Criteria를 활용하여 실제 검색을 수행하는 메서드 정의
public interface TourInfoCustom {
	
	List<TourInfo> findToursByCriteria(TourInfoCriteria criteria);
}
