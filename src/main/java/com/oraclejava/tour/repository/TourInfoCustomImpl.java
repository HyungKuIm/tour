package com.oraclejava.tour.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.transaction.annotation.Transactional;

import com.oraclejava.tour.model.TourInfo;

public class TourInfoCustomImpl implements TourInfoCustom{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public List<TourInfo> findToursByCriteria(TourInfoCriteria criteria) {
		// 쿼리 작성
		String jpql = "SELECT t FROM TourInfo t ";
		jpql += "WHERE 1 = 1 ";
		//여행 이름
		if (criteria.getTourName() != null) {
			jpql += " AND t.tourName LIKE :tourName ESCAPE '\\'";
		}
		//여행 기간
		if (criteria.getTourDays() != null) {
			jpql += " AND t.tourDays = :tourDays ";
		}
		//출발 일
		if (criteria.getDepStartDay() != null && 
				criteria.getDepEndDay() != null) {
			jpql += " AND t.depDay BETWEEN :depStartDay AND :depEndDay ";
		}
		
		jpql += " ORDER BY t.depDay "; // 출발일자 순으로 정렬
		
		TypedQuery<TourInfo> query = em.createQuery(jpql, TourInfo.class);
		if (criteria.getTourName() != null) {
			String name = criteria.getTourName().replace("_", "\\_");
			name = name.replace("%", "\\%");
			query.setParameter("tourName", "%" + name + "%");
		}
		
		//여행 기간
		if (criteria.getTourDays() != null) {
			query.setParameter("tourDays", criteria.getTourDays());
		}
		
		//출발 일
		if (criteria.getDepStartDay() != null && 
				criteria.getDepEndDay() != null) {
			query.setParameter("depStartDay", criteria.getDepStartDay());
			query.setParameter("depEndDay", criteria.getDepEndDay());
		}
		
		List<TourInfo> tourInfoList = query.getResultList();
		
		return tourInfoList;
	}

}







