package com.student.service;

import java.util.List;
import com.student.model.Student;
import com.student.repository.StudentRepoImpl;
import com.student.repository.StudentRepository;

public class StudentServiceImpl implements StudentService {
	private StudentRepository studentRepo = new StudentRepoImpl();

	@Override
	public boolean isAddStudent(Student student) {
		return studentRepo.isAddStudent(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepo.getAllStudents();
	}

	@Override
	public Student getStudentById(int id) {
		return studentRepo.getStudentById(id);
	}

	@Override
	public boolean updateStudent(int id, String newName, int newPercentage) {
		return studentRepo.updateStudent(id, newName, newPercentage);
	}

	@Override
	public boolean deleteStudentById(int id) {
		return studentRepo.deleteStudentById(id);
	}

	@Override
	public void evaluateResults() {
		List<Student> students = studentRepo.getAllStudents();
		for (Student s : students) {
			s.setResult(s.getPercentage() >= 35);
		}
	}
}

