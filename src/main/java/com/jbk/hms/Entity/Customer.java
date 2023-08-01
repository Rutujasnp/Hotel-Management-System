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
private String cName;
private int age;
private int MobileNo;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "room_id", referencedColumnName = "roomId")
private int roomId;

@OneToMany(mappedBy = "payment")
@JoinColumn(name = "paymentId", referencedColumnName = "pId")
private int paymentId;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)

public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}

public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getMobileNo() {
	return MobileNo;
}
public void setMobileNo(int mobileNo) {
	MobileNo = mobileNo;
}
public int getRoomId() {
	return roomId;
}
public void setRoomId(int roomId) {
	this.roomId = roomId;
}

public int getPaymentId() {
	return paymentId;
}

public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
@Override
public String toString() {
	return "Customer [cid=" + cid + ", cName=" + cName + ", age=" + age + ", MobileNo=" + MobileNo + ", roomId="
			+ roomId + ", paymentId=" + paymentId + "]";
}
}