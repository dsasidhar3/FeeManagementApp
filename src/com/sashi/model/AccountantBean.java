package com.sashi.model;

public class AccountantBean {
	
	private String id,name,email,password,place,contact;

	public AccountantBean(String id, String name, String email, String password, String place, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.place = place;
		this.contact = contact;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getPlace() {
		return place;
	}

	public String getContact() {
		return contact;
	}
	
	
	
	

}
