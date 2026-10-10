package com.payroll.repository;

import java.util.List;
import com.payroll.model.Dept;

public interface DeptRepository {
	public boolean isAddDept(Dept d);
	public List<Dept> getAllDepts();
	public Dept deleteDept(int id);
	public Dept updateDept(int id, String newName);
	public Dept getDeptByName(String name);
}