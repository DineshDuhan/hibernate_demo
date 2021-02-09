package com.duhan.HibernateProject;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
    @Id
 	private int Lid;
 	private String Lname;
 	@ManyToOne
 	private Student student;
 		
	public int getLid() {
		return Lid;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	@Override
	public String toString() {
		return "laptop [Lid=" + Lid + ", Lname=" + Lname + "]";
	}
	
	
}
