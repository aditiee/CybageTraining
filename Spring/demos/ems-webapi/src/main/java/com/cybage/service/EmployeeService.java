package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cybage.model.Employee;
import com.cybage.repository.EmployeeRespository;

@Service
public class EmployeeService {

	 Logger logger=LogManager.getLogger("EmployeeService.class");
	 
	//assume dao
		 @Autowired
	 EmployeeRespository employeeRespository;
	
	public EmployeeService() {

	
	}
	
	public List<Employee> getemployees(){
		return employeeRespository.findAll();
	}
	
	
	
	public Page<Employee> getemployeesPage(Pageable p){
		return employeeRespository.findAll(p);
	}
	
	
	
	public void addEmployee(Employee employee){
		
		employeeRespository.save(employee);
		
	}
	
	

	public void deleteEmployee(Long id){
		employeeRespository.deleteById(id);
		logger.info("Deleted  "+id);
	}
	
	
	public void editEmployee(Employee e){
		
		//logger.info("Edit index: "+index);
		logger.info("New edit object: "+e);
		employeeRespository.save( e);
		
	}
	
	
	public Employee getEmployeeById(Long id){
		return employeeRespository.getById(id);
	}
	
	public Employee findbyname(String name){
		//return employeeRespository.findByEname(name);
		return employeeRespository.getByname(name);
	}

	public List<Employee> findbydesgn(String desgn){
		return employeeRespository.getByDesign(desgn);
	}
	
	
}
