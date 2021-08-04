package com.cybage.controller;

import javax.validation.Valid;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cybage.model.Employee;
import com.cybage.service.EmployeeService;

@Controller
public class EmployeeController {
	
	 Logger logger=LogManager.getLogger("EmployeeController.class");
	 
	@Autowired
	EmployeeService employeeService;

//	@RequestMapping("/employee")
//	public ModelAndView employee(Model m){
//		m.addAttribute("emp", new Employee(101, "John", "Manager", 74545f));
//		return new ModelAndView("employee");
//	}
	
	///READ
	@RequestMapping("/employee")
	public ModelAndView employees(){
		
		return new ModelAndView("employee","emp",employeeService.getemployees());
	}
	

	//CREATE
	@GetMapping("/add")
	public String showAddPersonForm(Model model) {
		logger.info("Inside createEmployee object");
		model.addAttribute("emp",new Employee());
	  return "addEmployee";
	}

	//CREATE
	@PostMapping("/add")
	public String addPerson(@Valid @ModelAttribute("emp") Employee emp, BindingResult result) {
	  if (result.hasErrors()) {
		  logger.info("Inside post error");
	    return "addEmployee";
	  }
	  employeeService.addEmployee(emp);
	  logger.info("Inside add object");
	  return "employee";
	}
	
	//delete[
	@GetMapping("/delete/{id}")
	public ModelAndView deleteEmployee(@PathVariable int id) {
		logger.info("Inside delete object");
		Employee e=employeeService.getEmployeeById(id);
		employeeService.deleteEmployee(e);
	  return new ModelAndView("employee","emp",employeeService.getemployees());
	}
	


		
	
	
	//edit[
		@GetMapping("/edit/{id}")
		public String editEmployee(@PathVariable int id,Model model) {
			logger.info("Inside delete object");
			Employee e=employeeService.getEmployeeById(id);
			model.addAttribute("emp",e);
			  return "updateEmployee";
			
		
		}
		
		//edit
				@PostMapping("/edit")
				public String editPerson(@Valid @ModelAttribute("emp") Employee emp, BindingResult result,Model model) {
				  if (result.hasErrors()) {
					  logger.info("Inside edit error");
				    return "updateEmployee";
				  }
				  employeeService.editEmployee(emp);
				  logger.info("Inside edit object");
				  model.addAttribute("emp",employeeService.getemployees());
				  return "employee";
				}
	
}
