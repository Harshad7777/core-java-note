package com.payroll.repository;

import java.util.ArrayList;
import java.util.List;
import com.payroll.model.Attendance;

public class AttendanceRepoImpl implements AttendanceRepository {
	private List<Attendance> attendList = new ArrayList<>();
	
	@Override
	public boolean isMaintainAttendance(Attendance attend) {
		return attendList.add(attend);
	}

	@Override
	public List<Attendance> getAllAttendance() {
		return attendList;
	}
}