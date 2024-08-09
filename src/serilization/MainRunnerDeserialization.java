package serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.EOFException;

public class MainRunnerDeserialization {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        try (FileInputStream fin = new FileInputStream("C:\\javaworkspace\\serilization__deserilization\\serilization.txt");
             ObjectInputStream oin = new ObjectInputStream(fin)) {

            System.out.println("Students details:");
            while (true) {
                try {
                    Student std = (Student) oin.readObject();
                    students.add(std);  // Add to the list
                } catch (EOFException e) {
                    break; // End of file reached
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        // Now print all the deserialized students
        for (Student std : students) {
            System.out.println("Student ID: " + std.getStudentId());
            System.out.println("Student Name: " + std.getStudentName());
            System.out.println("Student Age: " + std.getStudentage());
            System.out.println("Student Address: " + std.getStudentAddress());
            System.out.println();
        }

        // Output the total number of records deserialized
        System.out.println("Total number of records deserialized: " + students.size());
    }
}
