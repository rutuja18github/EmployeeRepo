package com.emp.employeewage;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Employee {
	private static final Logger logger = LogManager.getLogger(App.class);
	boolean attendence;
	int empHrs;
	int salary;
	int empRatePerHr = 20;
	final int fullTime = 1;
	final int partTime = 2;
	int numOfWorkingDays=20;
	int totalSalary=0;
	int totalWorkingDays=0;
	int totalHrsInMonth=100;
	int totalEmpHr=0;
	
	Random random = new Random();

	public boolean empAttendance() {
		attendence = random.nextBoolean();
		if (attendence) {
			logger.info("Employee is Present");
		} else {
			logger.info("Employee is Absent");
		}
		return attendence;
	}

	public int dailyEmpWage() {
		int empType = random.nextInt(2) + 1;
		if (empAttendance()) {
			switch (empType) {
			case fullTime:
				logger.info("Employee is PartTime");
				empHrs = 4;
				break;

			case partTime:
				empHrs = 8;
				logger.info("Employee is FullTime");
				break;
			}
		} else {
			empHrs = 0;
		}
		salary = empRatePerHr * empHrs;
		logger.info("Employee's One Day Salary is :" +salary);
		return salary;
	}
	
	public int montlyWage() {
		while(totalEmpHr < totalHrsInMonth && totalWorkingDays < numOfWorkingDays ){
			  totalWorkingDays++;
		      totalSalary=totalSalary+dailyEmpWage();
		      totalEmpHr=totalEmpHr+empHrs;
	    }
		logger.info("Total Hours of Employee In Month :"+totalEmpHr);
		return totalSalary;
		
	}
}
