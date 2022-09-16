package com.emp.employeewage;

import java.util.Random;

public class Employee {
	boolean attendence;
	int empHrs;
	int salary;
	int empRatePerHr = 20;
	final int fullTime = 1;
	final int partTime = 2;
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
		int empType = random.nextInt(2) + 1;
		if (empAttendance()) {
			switch (empType) {
			case fullTime:
				System.out.println("Employee is PartTime");
				empHrs = 4;
				break;

			case partTime:
				empHrs = 8;
				System.out.println("Employee is FullTime");
				break;
			}
		} else {
			empHrs = 0;
		}
		salary = empRatePerHr * empHrs;
		System.out.println("Employee's One Day Salary is :" +salary);
		return salary;
	}
}
