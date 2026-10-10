package com.payroll.client;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.payroll.model.Attendance;
import com.payroll.model.Dept;
import com.payroll.model.Employee;
import com.payroll.service.AttendanceService;
import com.payroll.service.AttendanceServiceImpl;
import com.payroll.service.DeptService;
import com.payroll.service.DeptServiceImpl;
import com.payroll.service.EmployeeService;
import com.payroll.service.EmployeeServiceImpl;

public class ClientApplication {
	private static DeptService deptService = new DeptServiceImpl();
	private static EmployeeService empService = new EmployeeServiceImpl();
	private static AttendanceService attendService = new AttendanceServiceImpl();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean running = true;

		do {
			System.out.println("\n===== PAYROLL & DEPARTMENT MANAGEMENT SYSTEM =====");
			System.out.println("1. Add Department");
			System.out.println("2. View All Departments");
			System.out.println("3. Delete Dept By ID");
			System.out.println("4. Update Dept By ID");
			System.out.println("5. View Dept By Name");
			System.out.println("6. Add Employee to Dept");
			System.out.println("7. View All Employee Details");
			System.out.println("8. View Dept-wise Employee Details");
			System.out.println("9. Delete Employee Details By ID");
			System.out.println("10. Maintain Attendance");
			System.out.println("11. Show All Attendance Records");
			System.out.println("12. Exit");
			System.out.print("Enter your choice: ");
			
			if (!sc.hasNextInt()) {
				System.out.println("Invalid input! Please enter a number.");
				sc.next();
				continue;
			}
			
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter dept name: ");
				String deptName = sc.next();
				System.out.print("Enter dept id: ");
				int deptId = sc.nextInt();

				Dept d = new Dept(deptId, deptName);
				boolean added = deptService.isAddDept(d);
				if (added) {
					System.out.println("Department added successfully.");
				} else {
					System.out.println("Department already exists!");
				}
				break;

			case 2:
				List<Dept> depts = deptService.getAllDepts();
				System.out.println("\nAll Department Details");
				System.out.println("--------------------------------------");
				if (!depts.isEmpty()) {
					for (Dept deptObj : depts) {
						System.out.println("ID: " + deptObj.getId() + "\tName: " + deptObj.getName());
					}
				} else {
					System.out.println("No departments added yet.");
				}
				System.out.println("--------------------------------------");
				break;

			case 3:
				System.out.print("Enter dept ID to delete: ");
				int id = sc.nextInt();
				Dept deletedDept = deptService.deleteDept(id);

				if (deletedDept != null) {
					System.out.println("Department '" + deletedDept.getName() + "' deleted successfully.");
				} else {
					System.out.println("Department ID not found!");
				}
				break;

			case 4:
				System.out.print("Enter dept ID to update: ");
				id = sc.nextInt();
				System.out.print("Enter new dept name: ");
				String newName = sc.next();
				
				Dept updatedDept = deptService.updateDept(id, newName);
				if (updatedDept != null) {
					System.out.println("Department updated successfully.");
				} else {
					System.out.println("Department ID not found!");
				}
				break;

			case 5:
				System.out.print("Enter dept name: ");
				String name = sc.next();
				Dept foundDept = deptService.getDeptByName(name);
				
				if (foundDept != null) {
					System.out.println("\nDepartment Found:");
					System.out.println("ID: " + foundDept.getId() + "\tName: " + foundDept.getName());
				} else {
					System.out.println("Department name does not exist!");
				}
				break;

			case 6:
				List<Dept> availableDepts = deptService.getAllDepts();
				if (availableDepts.isEmpty()) {
					System.out.println("No departments available. Please create a department first.");
					break;
				}
				
				System.out.println("\nAvailable Departments:");
				for (Dept deptObj : availableDepts) {
					System.out.println("ID: " + deptObj.getId() + "\tName: " + deptObj.getName());
				}
				System.out.println("---------------------------------");
				
				System.out.print("Enter employee ID: ");
				int empId = sc.nextInt();
				System.out.print("Enter employee name: ");
				String empName = sc.next();
				System.out.print("Enter employee salary: ");
				int empSalary = sc.nextInt();
				
				System.out.print("Enter dept ID to assign employee: ");
				id = sc.nextInt();
				
				Dept targetDept = null;
				for (Dept deptObj : availableDepts) {
					if (deptObj.getId() == id) {
						targetDept = deptObj;
						break;
					}
				}

				if (targetDept != null) {
					Employee emp = new Employee(empId, empName, empSalary);
					emp.setDept(targetDept);
					targetDept.getEmpList().add(emp);
					
					boolean saved = empService.isAddEmployee(emp);
					if (saved) {
						System.out.println("Employee saved and assigned to department '" + targetDept.getName() + "' successfully.");
					} else {
						System.out.println("Failed to save employee!");
					}
				} else {
					System.out.println("Department ID not found!");
				}
				break;

			case 7:
				List<Employee> empList = empService.getEmployeeList();
				System.out.println("\nAll Employee Details");
				System.out.println("--------------------------------------");
				if (!empList.isEmpty()) {
					for (Employee e : empList) {
						String dName = (e.getDept() != null) ? e.getDept().getName() : "Unassigned";
						System.out.println("ID: " + e.getEmpId() + "\tName: " + e.getEmpName() + "\tSalary: " + e.getEmpSalary() + "\tDept: " + dName);
					}
				} else {
					System.out.println("No employees found.");
				}
				System.out.println("--------------------------------------");
				break;

			case 8:
				System.out.print("Enter dept name to view employees: ");
				name = sc.next();
				List<Employee> allEmployees = empService.getEmployeeList();
				boolean empFound = false;

				System.out.println("\nEmployees in Department '" + name + "':");
				System.out.println("--------------------------------------");
				for (Employee e : allEmployees) {
					if (e.getDept() != null && e.getDept().getName().equalsIgnoreCase(name)) {
						System.out.println("ID: " + e.getEmpId() + "\tName: " + e.getEmpName() + "\tSalary: " + e.getEmpSalary());
						empFound = true;
					}
				}
				if (!empFound) {
					System.out.println("No employees found in department '" + name + "'.");
				}
				System.out.println("--------------------------------------");
				break;

			case 9:
				System.out.print("Enter employee ID to delete: ");
				int empid = sc.nextInt();
				boolean deleted = empService.deleteEmpById(empid);

				if (deleted) {
					System.out.println("Employee deleted successfully.");
				} else {
					System.out.println("Employee ID not found!");
				}
				break;

			case 10:
				empList = empService.getEmployeeList();
				if (empList.isEmpty()) {
					System.out.println("No employees available to mark attendance.");
					break;
				}
				
				System.out.println("\nEmployee List:");
				for (Employee e : empList) {
					System.out.println("ID: " + e.getEmpId() + "\tName: " + e.getEmpName());
				}
				
				System.out.print("Enter employee ID for attendance: ");
				empid = sc.nextInt();
				
				Employee targetEmp = null;
				for (Employee e : empList) {
					if (e.getEmpId() == empid) {
						targetEmp = e;
						break;
					}
				}

				if (targetEmp != null) {
					Date inTime = new Date();
					Date outTime = new Date(inTime.getTime() + (8 * 60 * 60 * 1000)); // 8 hours later
					
					Attendance attend = new Attendance();
					attend.setEmployee(targetEmp);
					attend.setDate(new Date());
					attend.setInTime(inTime);
					attend.setOutTime(outTime);
					attend.setStatus(true);

					boolean marked = attendService.isMaintainAttendance(attend);
					if (marked) {
						System.out.println("Attendance marked successfully for " + targetEmp.getEmpName());
					} else {
						System.out.println("Failed to mark attendance.");
					}
				} else {
					System.out.println("Employee ID not found!");
				}
				break;

			case 11:
				List<Attendance> attendList = attendService.getAllAttendance();
				System.out.println("\nAll Attendance Records");
				System.out.println("------------------------------------------------------------------");
				if (!attendList.isEmpty()) {
					for (Attendance aobj : attendList) {
						Employee e = aobj.getEmployee();
						String dName = (e != null && e.getDept() != null) ? e.getDept().getName() : "Unassigned";
						String empN = (e != null) ? e.getEmpName() : "Unknown";
						int empI = (e != null) ? e.getEmpId() : 0;
						
						System.out.println("EmpID: " + empI + "\tName: " + empN + "\tDept: " + dName + 
								"\tInTime: " + aobj.getInTime() + "\tOutTime: " + aobj.getOutTime() + 
								"\tPresent: " + aobj.isStatus());
					}
				} else {
					System.out.println("No attendance records found.");
				}
				System.out.println("------------------------------------------------------------------");
				break;

			case 12:
				System.out.println("Exiting System... Goodbye!");
				running = false;
				break;

			default:
				System.out.println("Invalid Choice! Please enter a option between 1 and 12.");
			}

		} while (running);
		
		sc.close();
	}
}