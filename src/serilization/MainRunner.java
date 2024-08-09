package serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner {


	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student(1, "John Doe", 20, "123 Main St"));
		students.add(new Student(2, "Jane Smith", 21, "456 Oak St"));
		students.add(new Student(3, "Mark Brown", 22, "789 Pine St"));

		try (FileOutputStream fout = new FileOutputStream("C:\\javaworkspace\\serilization__deserilization\\serilization.txt");
				ObjectOutputStream oout = new ObjectOutputStream(fout)) {

			for (Student student : students) {
				oout.writeObject(student);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Serialization complete.");
	}




}




