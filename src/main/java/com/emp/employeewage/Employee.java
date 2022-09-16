package com.emp.employeewage;

import java.util.Random;

public class Employee {
	boolean attendence ;
	Random random = new Random();
	
	public void EmpAttendance() {
		attendence = random.nextBoolean();
		if (attendence) {
			System.out.println("Employee is Present");	
		} else {
			System.out.println("Employee is Absent");
	    }
	}

}
