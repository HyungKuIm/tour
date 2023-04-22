package com.oraclejava.tour.repository;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

//검색조건을 위한 클래스
@Getter
@Setter
public class TourInfoCriteria {
	private String tourName;
	private Integer tourDays;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date depStartDay;  // 출발 시작 일
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date depEndDay;    // 출발 종료 일
	private Integer baseStartPrice;  // 시작가격
	private Integer baseEndPrice;  // 종료가격
	private String conductor;
	private String tourAbs;
}
