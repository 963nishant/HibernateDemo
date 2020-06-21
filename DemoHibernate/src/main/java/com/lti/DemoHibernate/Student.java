package com.lti.DemoHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private int S_id;
	private StudentName S_name;
	private String S_add;

	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}

	public StudentName getS_name() {
		return S_name;
	}
	public void setS_name(StudentName s_name) {
		S_name = s_name;
	}
	
	public String getS_add() {
		return S_add;
	}
	public void setS_add(String s_add) {
		S_add = s_add;

	}
	@Override
	public String toString() {
		return "Student [S_id=" + S_id + ", S_name=" + S_name + ", S_add=" + S_add + "]";
	}
	
}
