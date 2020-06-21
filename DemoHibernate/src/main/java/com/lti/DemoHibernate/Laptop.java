package com.lti.DemoHibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Laptop {
	
	@Id
	private int lid;
	private String lname;
	@OneToMany(mappedBy="laptop")
	private List<Employee> emp =new ArrayList<Employee>();
	
	
	
	public List<Employee> getEmp() {
		return emp;
	}
	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + "]";
	}

}
