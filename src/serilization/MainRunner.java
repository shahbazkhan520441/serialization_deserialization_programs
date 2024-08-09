package serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class MainRunner {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id");
		int id=sc.nextInt();
		System.out.println("inter student name");
		String studentName=sc.next();
		System.out.println("enter student age");
		int age=sc.nextInt();
		System.out.println("enter student address");
		String address=sc.next();

		Student s =new Student(id, studentName, age, address);	

		try {
			
			FileOutputStream fout=new FileOutputStream("C:\\javaworkspace\\serilization__deserilization\\serilization.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
            
			out.writeObject(s);

			out.flush();
			fout.flush();
			out.close();
			fout.close();
			
			System.out.println("serilization of object has done sucessfully");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}



}
