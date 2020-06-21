package com.lti.DemoHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	
	@Id
	private int Eid;
	private String Ename;
	private String Eadd;
	@ManyToOne
	private Laptop laptop;
	
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getEadd() {
		return Eadd;
	}
	public void setEadd(String eadd) {
		Eadd = eadd;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Eadd=" + Eadd + "]";
	}

}
