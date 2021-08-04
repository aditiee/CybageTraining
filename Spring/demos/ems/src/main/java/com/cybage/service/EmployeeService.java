package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.cybage.model.Employee;

@Service
public class EmployeeService {

	 Logger logger=LogManager.getLogger("EmployeeService.class");
	//assume dao
	List<Employee> employees;
	
	public EmployeeService() {
	employees=new ArrayList<Employee>();
	employees.add(new Employee(101, "Sam", "Manager", 45335f));
	employees.add(new Employee(102, "Riya", "SE", 45335f));
	employees.add(new Employee(103, "Harry", "Manager", 45335f));
	employees.add(new Employee(104, "Jason", "SE", 45335f));
	
	}
	
	public List<Employee> getemployees(){
		return employees;
	}
	
	public void addEmployee(Employee employee){
		
		employees.add(employee);
		
	}
	
	
	public int getIndexEmployee(Employee emp){
		logger.info("emp old object: "+emp);
		Employee enew=new Employee();
		for(Employee e: employees){
			if(e.getEmpid()==emp.getEmpid()){
				enew=e;
					break;
			}
		}
		logger.info("emp old object: "+employees.indexOf(enew));
		return employees.indexOf(enew);
	}
	
	
	public void deleteEmployee(Employee e){
		int index=getIndexEmployee(e);
		logger.info("Delete index: "+index);
		employees.remove(index);
		logger.info("Deleted list: "+employees);
	}
	
	
	public void editEmployee(Employee e){
		int index=getIndexEmployee(e);
		logger.info("Edit index: "+index);
		logger.info("New edit object: "+e);
		employees.set(index, e);
		
	}
	
	
	public Employee getEmployeeById(int id){
		Employee emp=new Employee();
		for(Employee e: employees){
			if(e.getEmpid()==id){
				emp=e;
					break;
			}
		}
		return emp;
	}
	
	
	
	
}
