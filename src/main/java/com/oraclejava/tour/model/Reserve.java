package com.oraclejava.tour.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "reserve")
public class Reserve {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reserve_id_seq")
	@SequenceGenerator(name = "reserve_id_seq", sequenceName = "reserve_seq", allocationSize = 1)
	private int reserveNo;
	//private int tourCode;
	private Date reserveDay;
	private int adultCount;
	private int childCount;
	//private int customerCode;
	private int sumPrice;
	private String remarks;
	
	@JoinColumn(name = "tour_code", referencedColumnName = "tour_code")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private TourInfo tourInfo;
	
	@JoinColumn(name = "customer_code", referencedColumnName = "customer_code")
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	private Customer customer;
}
