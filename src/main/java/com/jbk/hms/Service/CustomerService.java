package com.jbk.hms.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jbk.hms.Dao.CustomerDao;
import com.jbk.hms.Entity.Customer;
@Component
@Service
public class CustomerService {
	@Autowired
	CustomerDao cd;

	public List<Customer> getAllCustomerDetails() {
		return cd.getAllCustomerDetails();
	}

	public String insertNewCustomer(Customer cc) {
		return cd.insertNewCustomer(cc);
	}

	public String updateCustomer(Customer cc) {
	return cd.updateCustomer(cc);
		
	}

}
