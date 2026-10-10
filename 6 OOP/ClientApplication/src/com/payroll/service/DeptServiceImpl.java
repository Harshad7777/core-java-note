package com.payroll.service;

import java.util.List;
import com.payroll.model.Dept;
import com.payroll.repository.DeptRepoImpl;
import com.payroll.repository.DeptRepository;

public class DeptServiceImpl implements DeptService {	
	private DeptRepository deptRepo = new DeptRepoImpl();

	@Override
	public boolean isAddDept(Dept d) {
		return deptRepo.isAddDept(d);
	}

	@Override
	public List<Dept> getAllDepts() {
		return deptRepo.getAllDepts();
	}
	
	@Override
	public Dept deleteDept(int id) {
		return deptRepo.deleteDept(id);
	}
	
	@Override
	public Dept updateDept(int id, String newName) {
		return deptRepo.updateDept(id, newName);
	}

	@Override
	public Dept getDeptByName(String name) {
		return deptRepo.getDeptByName(name);
	}
}