package com.jbk.hms.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int paymentId;

@ManyToOne
@JoinColumn(name = "customer_id", referencedColumnName = "cid")
private Customer customer;

public int getpId() {
	return paymentId;
}

public void setpId(int pId) {
	this.paymentId = pId;
}

public Customer getCustomer() {
	return customer;
}

public void setCustomer(Customer customer) {
	this.customer = customer;
}


}
