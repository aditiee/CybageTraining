package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Employee;
import com.cybage.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> getemployee(){
		return employeeService.getemployees();
	}
	
	
	
	@GetMapping("/employeeDesgn")
	public ResponseEntity<List<Employee>> getemployeeByName(@RequestParam("n") String name){
		return new ResponseEntity<List<Employee>>(employeeService.findbydesgn(name),HttpStatus.OK);
	}
	
	
	
	@PostMapping("/employee")
	public ResponseEntity<String> addemployee(@RequestBody Employee e){
		employeeService.addEmployee(e);
		return new ResponseEntity<String>("ADDED!!",HttpStatus.CREATED);
	}
	
	
	@DeleteMapping("/employee/{id}")
	public List<Employee> deleteemployee(@PathVariable int id){
		//employeeService.addEmployee(e);
		return employeeService.getemployees();
	}
	
	@PutMapping("/employee/{id}")
	public List<Employee> editemployee(@PathVariable int id,@RequestBody Employee e){
		//employeeService.addEmployee(e);
		return employeeService.getemployees();
	}
}
