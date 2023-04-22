package com.oraclejava.tour.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.oraclejava.tour.model.TourInfo;
import com.oraclejava.tour.repository.TourInfoCriteria;
import com.oraclejava.tour.repository.TourInfoRepository;

@Transactional
@Service
public class TourInfoServiceImpl implements TourInfoService{

	@Autowired
	private TourInfoRepository tourInfoRepository;
	
	@Override
	public List<TourInfo> searchTourAll() {
		return tourInfoRepository.findAll();
	}
	
	@Override
	public List<TourInfo> searchTour(TourInfoCriteria criteria) {
		return tourInfoRepository.findToursByCriteria(criteria);
	}

}
