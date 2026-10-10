package com.payroll.repository;

import java.util.List;
import com.payroll.model.Attendance;

public interface AttendanceRepository {
	public boolean isMaintainAttendance(Attendance attend);
	public List<Attendance> getAllAttendance();
}