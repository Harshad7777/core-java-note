package com.student.client;

import java.util.List;
import java.util.Scanner;

import com.student.model.Student;
import com.student.service.StudentService;
import com.student.service.StudentServiceImpl;

public class StudentManagement {
	private static StudentService studentService = new StudentServiceImpl();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean running = true;

		while (running) {
			System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
			System.out.println("1. Add Student");
			System.out.println("2. Display All Students");
			System.out.println("3. Search Student By ID");
			System.out.println("4. Update Student Details");
			System.out.println("5. Delete Student By ID");
			System.out.println("6. Evaluate & View Results");
			System.out.println("7. Exit");
			System.out.print("Enter choice: ");

			if (!sc.hasNextInt()) {
				System.out.println("Invalid input! Please enter a number.");
				sc.next();
				continue;
			}

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter Student ID: ");
				int id = sc.nextInt();
				System.out.print("Enter Student Name: ");
				String name = sc.next();
				System.out.print("Enter Student Percentage: ");
				int per = sc.nextInt();

				Student student = new Student(id, name, per);
				boolean added = studentService.isAddStudent(student);
				if (added) {
					System.out.println("Student added successfully.");
				} else {
					System.out.println("Student ID already exists!");
				}
				break;

			case 2:
				List<Student> students = studentService.getAllStudents();
				System.out.println("\nAll Student Records");
				System.out.println("--------------------------------------------------");
				if (!students.isEmpty()) {
					for (Student s : students) {
						System.out.println("ID: " + s.getId() + "\tName: " + s.getName() + "\tPercentage: " + s.getPercentage() + "%");
					}
				} else {
					System.out.println("No student records available.");
				}
				System.out.println("--------------------------------------------------");
				break;

			case 3:
				System.out.print("Enter Student ID to search: ");
				id = sc.nextInt();
				Student found = studentService.getStudentById(id);
				if (found != null) {
					System.out.println("\nStudent Found:");
					System.out.println("ID: " + found.getId() + "\tName: " + found.getName() + "\tPercentage: " + found.getPercentage() + "%");
				} else {
					System.out.println("Student ID not found!");
				}
				break;

			case 4:
				System.out.print("Enter Student ID to update: ");
				id = sc.nextInt();
				System.out.print("Enter New Name: ");
				String newName = sc.next();
				System.out.print("Enter New Percentage: ");
				int newPer = sc.nextInt();

				boolean updated = studentService.updateStudent(id, newName, newPer);
				if (updated) {
					System.out.println("Student updated successfully.");
				} else {
					System.out.println("Student ID not found!");
				}
				break;

			case 5:
				System.out.print("Enter Student ID to delete: ");
				id = sc.nextInt();
				boolean deleted = studentService.deleteStudentById(id);
				if (deleted) {
					System.out.println("Student deleted successfully.");
				} else {
					System.out.println("Student ID not found!");
				}
				break;

			case 6:
				studentService.evaluateResults();
				List<Student> evalList = studentService.getAllStudents();
				System.out.println("\nStudent Result Evaluation");
				System.out.println("------------------------------------------------------------------");
				if (!evalList.isEmpty()) {
					for (Student s : evalList) {
						String status = s.isResult() ? "Pass" : "Fail";
						System.out.println("ID: " + s.getId() + "\tName: " + s.getName() + "\tPercentage: " + s.getPercentage() + "%\tResult: " + status);
					}
				} else {
					System.out.println("No student records available to evaluate.");
				}
				System.out.println("------------------------------------------------------------------");
				break;

			case 7:
				System.out.println("Exiting System... Goodbye!");
				running = false;
				break;

			default:
				System.out.println("Invalid choice! Please select an option between 1 and 7.");
			}
		}

		sc.close();
	}
}

