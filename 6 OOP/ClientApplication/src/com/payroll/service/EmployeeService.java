package com.payroll.service;

import java.util.List;
import com.payroll.model.Employee;

public interface EmployeeService {
	public boolean isAddEmployee(Employee employee);
	public List<Employee> getEmployeeList();
	public boolean deleteEmpById(int id);
}