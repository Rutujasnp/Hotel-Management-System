package com.jbk.hms.Dao;

import java.util.List;

import org.hibernate.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jbk.hms.Entity.Customer;
import com.jbk.hms.Entity.Manager;

@Repository
public class CustomerDao {
	@Autowired
	private SessionFactory sf;

	public List<Customer> getAllCustomerDetails() {
		Session session = sf.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		List<Customer> al = criteria.list();

		return al;
	}
	public String insertNewCustomer(Customer cc) {
		Session session = sf.openSession();
		Transaction tr= session.beginTransaction();
		session.save(cc);
		tr.commit();
		return "Customer Details inserted successfully!";
	}
	
	
}
