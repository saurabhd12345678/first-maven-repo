package com.lti.view;

import com.lti.model.Employee;

public class Empview {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpid(1001);
		emp.setEmpname("John");
		
		System.out.println("employee id is:"+emp.getEmpid());
		System.out.println("employee name is:"+emp.getEmpname());
	}

}
