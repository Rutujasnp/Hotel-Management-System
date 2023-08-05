package com.jbk.hms.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	
private int cid;
private String c_name;
private int age;
private int mobile_no;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "room_id", referencedColumnName = "roomId")
private int room_id;

@OneToMany(mappedBy = "payment")
@JoinColumn(name = "paymentId", referencedColumnName = "pId")
private int payment_id;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)

public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getcName() {
	return c_name;
}
public void setcName(String c_name) {
	this.c_name = c_name;
}

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getMobileNo() {
	return mobile_no;
}
public void setMobileNo(int mobile_no) {
	this.mobile_no = mobile_no;
}
public int getRoomId() {
	return room_id;
}
public void setRoomId(int room_id) {
	this.room_id = room_id;
}

public int getPaymentId() {
	return payment_id;
}

public void setPaymentId(int payment_id) {
	this.payment_id = payment_id;
}
@Override
public String toString() {
	return "Customer [cid=" + cid + ", c_name=" + c_name + ", age=" + age + ", mobile_no=" + mobile_no + ", room_id="
			+ room_id + ", paymentId=" + payment_id + "]";
}
}