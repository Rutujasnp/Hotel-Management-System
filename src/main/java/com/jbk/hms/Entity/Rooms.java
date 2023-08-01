package com.jbk.hms.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Rooms")
public class Rooms {
private int  roomId;
private  String status;
private String takenFrom;
private String takenTill;
private int charges;
private boolean isAC;


@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "customer_id", referencedColumnName = "cid")
private int customerId;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "room_id")
public int getRoomId() {
	return roomId;
}
public void setRoomId(int roomId) {
	this.roomId = roomId;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getTakenFrom() {
	return takenFrom;
}
public void setTakenFrom(String takenFrom) {
	this.takenFrom = takenFrom;
}
public String getTakenTill() {
	return takenTill;
}
public void setTakenTill(String takenTill) {
	this.takenTill = takenTill;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public int getCharges() {
	return charges;
}
public void setCharges(int charges) {
	this.charges = charges;
}
public boolean isAC() {
	return isAC;
}
public void setAC(boolean isAC) {
	this.isAC = isAC;
}
@Override
public String toString() {
	return "Rooms [roomId=" + roomId + ", status=" + status + ", takenFrom=" + takenFrom + ", takenTill=" + takenTill
			+ ", charges=" + charges + ", isAC=" + isAC + ", customerId=" + customerId + "]";
}
}
