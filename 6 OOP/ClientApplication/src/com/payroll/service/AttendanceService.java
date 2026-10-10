package com.payroll.service;

import java.util.List;
import com.payroll.model.Attendance;

public interface AttendanceService {
	public boolean isMaintainAttendance(Attendance attend);
	public List<Attendance> getAllAttendance();
}