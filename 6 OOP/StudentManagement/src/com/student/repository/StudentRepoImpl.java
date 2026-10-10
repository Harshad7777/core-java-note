package com.student.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.student.model.Student;

public class StudentRepoImpl implements StudentRepository {
	private List<Student> studentList = new ArrayList<>();

	@Override
	public boolean isAddStudent(Student student) {
		if (getStudentById(student.getId()) != null) {
			return false; // Student ID already exists
		}
		return studentList.add(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentList;
	}

	@Override
	public Student getStudentById(int id) {
		for (Student s : studentList) {
			if (s.getId() == id) {
				return s;
			}
		}
		return null;
	}

	@Override
	public boolean updateStudent(int id, String newName, int newPercentage) {
		Student s = getStudentById(id);
		if (s != null) {
			s.setName(newName);
			s.setPercentage(newPercentage);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteStudentById(int id) {
		Iterator<Student> i = studentList.iterator();
		while (i.hasNext()) {
			Student s = i.next();
			if (s.getId() == id) {
				i.remove();
				return true;
			}
		}
		return false;
	}
}
