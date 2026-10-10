package com.payroll.service;

import java.util.List;
import com.payroll.model.Dept;

public interface DeptService {
	public boolean isAddDept(Dept d);
	public List<Dept> getAllDepts();
	public Dept deleteDept(int id);
	public Dept updateDept(int id, String newName);
	public Dept getDeptByName(String name);
}