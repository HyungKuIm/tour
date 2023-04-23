package com.oraclejava.tour.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oraclejava.tour.model.Customer;
import com.oraclejava.tour.service.CustomerService;

@Controller
@RequestMapping(value = "/customers")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private CustomerPassEqualsValidator passEqualsValidator;

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		webDataBinder.addValidators(passEqualsValidator);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String createForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "createCustomerForm";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(@Validated Customer customer, BindingResult result) {

		if (result.hasErrors()) {
			return "createCustomerForm";
		}

		customer.setRole("ROLE_USER");
		customerService.register(customer);
		return "redirect:/login";
	}
}





