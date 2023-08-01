package com.jbk.hms.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Staff {
	private int id;
	private String name;
	private int age;
	private int mobileNo;
	private String gmailId;
	private String branchName;
	private String profile;
	private Double salary;

	/*public Staff() {
		super();

		System.out.println("manager constructor");
	}*/
@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getGmailId() {
		return gmailId;
	}

	public void setGmailId(String gmailId) {
		this.gmailId = gmailId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", age=" + age + ", mobileNo=" + mobileNo + ", gmailId=" + gmailId
				+ ", branchName=" + branchName + ", profile=" + profile + ", salary=" + salary + "]";
	}
}