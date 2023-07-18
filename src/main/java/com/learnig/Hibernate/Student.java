package com.learnig.Hibernate;

public class Student {
	int id;
	String name;
	String address;
	int contact;
	
	public Student(int id, String name, String address, int contact) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + "]";
	}
	
}
