package com.oraclejava.tour.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import com.oraclejava.tour.model.TourInfo;
import com.oraclejava.tour.repository.TourInfoCriteria;
import com.oraclejava.tour.service.TourInfoService;

@Controller
@RequestMapping(value = "/tours")
public class SearchTourController {

	@Autowired
	private TourInfoService tourInfoService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String searchAll(
			@RequestParam(required = false, value = "tourName")
			String tourName,
			@RequestParam(required = false, value = "tourDays")
			Integer tourDays,
			@RequestParam(required = false, value = "depStartDay")
			String depStartDay,
			@RequestParam(required = false, value = "depEndDay")
			String depEndDay,
			Model model) throws ParseException {
		
		TourInfoCriteria criteria = new TourInfoCriteria();
		criteria.setTourName(tourName);
		criteria.setTourDays(tourDays);
		
		//포맷터
		SimpleDateFormat formatter = 
				new SimpleDateFormat("yyyy-MM-dd");
		// StringUtils(스프링 부트에 포함되어 있는 라이브러리)
		//if (depStartDay != null && depEndDay != null) {
		if (!StringUtils.isEmpty(depStartDay) 
				&& !StringUtils.isEmpty(depEndDay)) {
			criteria.setDepStartDay(formatter.parse(depStartDay));
			criteria.setDepEndDay(formatter.parse(depEndDay));
		}
		
//		List<TourInfo> tours = tourInfoService.searchTourAll();
		List<TourInfo> tours = tourInfoService.searchTour(criteria);
		model.addAttribute("tours", tours);
		// 검색값 유지
		model.addAttribute("tourName", tourName);
		model.addAttribute("tourDays", tourDays);
		model.addAttribute("depStartDay", depStartDay);
		model.addAttribute("depEndDay", depEndDay);
		
		return "searchTour";
	}
}
