package beans;

import java.io.Serializable;

public class Student {

	/**
	 * 
	 */
	public Student() {
		// TODO Auto-generated constructor stub
	}
	private int student_id;
	private String name;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
