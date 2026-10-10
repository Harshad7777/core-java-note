package com.payroll.repository;

import com.payroll.model.Employee;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeRepoImpl implements EmployeeRepository {
	private List<Employee> empList = new ArrayList<>();
	
	@Override
	public boolean isAddEmployee(Employee employee) {
		return empList.add(employee);
	}
	
	@Override
	public List<Employee> getEmployeeList() {
		return empList;
	}
	
	@Override
	public boolean deleteEmpById(int id) {
		Iterator<Employee> i = empList.iterator();
		while (i.hasNext()) {
			Employee e = i.next();
			if (e.getEmpId() == id) {
				i.remove();
				return true;
			}
		}
		return false;
	}
}