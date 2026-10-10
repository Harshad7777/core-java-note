package com.student.service;

import java.util.List;
import com.student.model.Student;

public interface StudentService {
	public boolean isAddStudent(Student student);
	public List<Student> getAllStudents();
	public Student getStudentById(int id);
	public boolean updateStudent(int id, String newName, int newPercentage);
	public boolean deleteStudentById(int id);
	public void evaluateResults();
}
