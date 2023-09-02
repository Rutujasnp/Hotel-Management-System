package com.jbk.hms.Dao;

import java.util.List;

import org.hibernate.Transaction;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.jbk.hms.Entity.Customer;
import com.jbk.hms.Entity.Manager;
@Component
@Repository
public class CustomerDao {
	@Autowired
	private SessionFactory sf;

	public List<Customer> getAllCustomerDetails() {
		Session session = sf.openSession();
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(Customer.class);
		@SuppressWarnings("unchecked")
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
	public String updateCustomer(Customer cc) {
		Session session = sf.openSession();
		Transaction tr= session.beginTransaction();
		session.update(cc);
		tr.commit();
		return "Customer Details updated successfully!";
		
	}
	
	
}
