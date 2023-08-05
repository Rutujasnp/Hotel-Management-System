package com.jbk.hms.Controller;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.hms.Entity.Customer;
import com.jbk.hms.Entity.Manager;
import com.jbk.hms.Service.CustomerService;
import com.jbk.hms.Service.ManagerService;

@Component
@RestController
@RequestMapping("/CustomerDetails")
public class CustomerController {
	@Autowired
	CustomerService cs;
	@Autowired
	SessionFactory sf;

	@GetMapping("/AllCustomerDetails")
	public List<Customer> getAllCustomerDetails() {
		System.out.println(" getAll method running...");
		return cs.getAllCustomerDetails();
	}
	@PostMapping("/insertCustomer")
	 public String insertNewCustomer(Customer cc) {
		 System.out.println("Customer details inserted");
		 return cs.insertNewCustomer( cc);
	 }
}
