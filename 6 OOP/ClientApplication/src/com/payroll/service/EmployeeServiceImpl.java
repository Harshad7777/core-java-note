package com.payroll.service;

import java.util.List;
import com.payroll.model.Employee;
import com.payroll.repository.EmployeeRepoImpl;
import com.payroll.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository empRepo = new EmployeeRepoImpl();

	@Override
	public boolean isAddEmployee(Employee employee) {
		return empRepo.isAddEmployee(employee);
	}
	
	@Override
	public List<Employee> getEmployeeList() {
		return empRepo.getEmployeeList();
	}

	@Override
	public boolean deleteEmpById(int id) {
		return empRepo.deleteEmpById(id);
	}
}