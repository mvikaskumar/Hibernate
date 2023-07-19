package com.learnig.Hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Annotations {
	@Id
	private int id;
	private String Name;
	private String level;
	private String designation;
	
	public Annotations(int id, String name, String level, String designation) {
		super();
		this.id = id;
		Name = name;
		this.level = level;
		this.designation = designation;
	}

	public Annotations() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Annotations [id=" + id + ", Name=" + Name + ", level=" + level + ", designation=" + designation + "]";
	}	

}
