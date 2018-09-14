package com.sashi.model;

public class StudentBean {
	
	private String rollnum,name,email,gender,course,address,contact;
	private int fee,paid,due;
	
	public StudentBean(String rollnum, String name, String email, String gender, String course, int fee,
			int paid, int due, String address, String contact) {
		super();
		this.rollnum = rollnum;
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.course = course;
		this.address = address;
		this.contact = contact;
		this.fee = fee;
		this.paid = paid;
		this.due = due;
	}

	public String getRollnum() {
		return rollnum;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public String getCourse() {
		return course;
	}

	public String getAddress() {
		return address;
	}

	public String getContact() {
		return contact;
	}

	public int getFee() {
		return fee;
	}

	public int getPaid() {
		return paid;
	}

	public int getDue() {
		return due;
	}
	
	


	
	

}
