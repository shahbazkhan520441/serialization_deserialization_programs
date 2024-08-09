package serilization;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 1L;
	int studentId;
	String studentName;
	int studentage;
	String studentAddress;
	
	public Student(int studentId, String studentName, int studentage, String studentAddress) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentage = studentage;
		this.studentAddress = studentAddress;
	}



}
