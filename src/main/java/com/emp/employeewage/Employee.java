package com.emp.employeewage;

import java.util.Random;

public class Employee {
	boolean attendence;
	int empHrs;
	int salary;
	int empRatePerHr = 20;
	
	Random random = new Random();

	public boolean empAttendance() {
		attendence = random.nextBoolean();
		if (attendence) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}
		return attendence;
	}

	public int dailyEmpWage() {
		if (empAttendance()) {
			empHrs = 8;
		} else {
			empHrs = 0;
		}
		salary = empRatePerHr * empHrs;
		return salary;
	}
}
