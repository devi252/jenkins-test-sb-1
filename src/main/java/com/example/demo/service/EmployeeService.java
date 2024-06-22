package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;

@Service
public class EmployeeService {

	List<Employee> employeeList = initEmployeeList();
	
	public static List<Employee> initEmployeeList() {
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1, "A", 'm'));
		list.add(new Employee(2, "B", 'f'));
		list.add(new Employee(3, "C", 'm'));
		list.add(new Employee(4, "D", 'f'));
		
		return list;
	}
	
	public List<Employee> getList(){
		return employeeList;
	}
	
	public Object addEmployee(Employee employee) {
		 boolean added = employeeList.add(employee);
		 if(added)
			 return employee;
		 else 
			 return "not able to add employee...";
	}
}
