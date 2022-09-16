package com.emp.employeewage;

import java.util.Random;

public class Employee {
	boolean attendence;
	int empHrs;
	int salary;
	int empRatePerHr = 20;
	final int partTime = 1;
	final int fullTime = 2;

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
			case partTime:
				System.out.println("Employee is Part Time");
				empHrs = 4;
				break;

			case fullTime:
				empHrs = 8;
				System.out.println("Employee is Full Time");
				break;
			}
		} else {
			empHrs = 0;
		}
		salary = empRatePerHr * empHrs;
		return salary;
	}
}
