package com.payroll.repository;

import java.util.List;
import com.payroll.model.Employee;

public interface EmployeeRepository {
	public boolean isAddEmployee(Employee employee);
	public List<Employee> getEmployeeList();
	public boolean deleteEmpById(int id);
}