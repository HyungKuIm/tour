package com.oraclejava.tour.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@Column(name = "customer_code")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "customer_code_seq")
	@SequenceGenerator(name = "customer_code_seq", sequenceName = "customer_seq", allocationSize = 1)
	private int customerCode;
	@NotEmpty
	@Size(max = 20)
	private String customerName;

	@NotEmpty
//	@Pattern(regexp = "[0-9a-zA-z]+")
	// 커스텀 벨리데이터를 사용할 경우 에러가 발생함
	@Size(min = 4, max = 100)
	private String customerPass;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull
	private Date customerBirth;

	@NotEmpty
	@Size(max = 40)
	private String customerJob;

	@Email
	@Size(max = 30)
	private String customerMail;

	@Pattern(regexp = "[0-9-]+")
	private String customerTel;

	@Pattern(regexp = "[0-9]{5}")
	private String customerPost;

	@NotEmpty
	private String customerAdd;

	private String role;
	
	@Transient
	@NotEmpty
//	@Pattern(regexp = "[0-9a-zA-z]+")
	@Size(min = 4, max = 100)
	private String customerPassConfirm;
}
