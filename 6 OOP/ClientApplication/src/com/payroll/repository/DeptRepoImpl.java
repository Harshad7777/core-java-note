package com.payroll.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.payroll.model.Dept;

public class DeptRepoImpl implements DeptRepository {
	private List<Dept> deptList = new ArrayList<>();

	@Override
	public boolean isAddDept(Dept d) {
		if (isDeptExist(d)) {
			return false;
		}
		return deptList.add(d);
	}

	private boolean isDeptExist(Dept d) {
		for (Dept d1 : deptList) {
			if (d.getName().equalsIgnoreCase(d1.getName()) || d.getId() == d1.getId()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<Dept> getAllDepts() {
		return deptList;
	}

	@Override
	public Dept deleteDept(int id) {
		Iterator<Dept> i = deptList.iterator();
		while (i.hasNext()) {
			Dept d = i.next();
			if (d.getId() == id) {
				i.remove();
				return d;
			}
		}
		return null;
	}

	@Override
	public Dept updateDept(int id, String newName) {
		for (Dept d : deptList) {
			if (d.getId() == id) {
				d.setName(newName);
				return d;
			}
		}
		return null;
	}

	@Override
	public Dept getDeptByName(String name) {
		for (Dept d : deptList) {
			if (d.getName().equalsIgnoreCase(name)) {
				return d;
			}
		}
		return null;
	}
}