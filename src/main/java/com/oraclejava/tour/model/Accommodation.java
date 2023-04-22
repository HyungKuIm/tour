package com.oraclejava.tour.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "accommodation")
public class Accommodation { // ==> accommodation 테이블로 맵핑
	@Id
	@Column(name = "accom_code")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accom_code_seq")
	@SequenceGenerator(name = "accom_code_seq", sequenceName = "accom_seq", allocationSize = 1)
	private int accomCode; //            1
    private String accomName;  //       오라클호텔
    private String accomTel; //           02-6047-2106
}
