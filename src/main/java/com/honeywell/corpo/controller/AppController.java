package com.honeywell.corpo.controller;

import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.honeywell.corpo.model.Employee;
import com.honeywell.corpo.model.EmployeeService;

@Controller
@RequestMapping("/")
public class AppController {

	@Autowired
	EmployeeService empService;
	
	@Autowired 
	MessageSource messageSource;
	
	@RequestMapping(value={"/","/list"}, method=RequestMethod.GET)
	public String listEmployees(ModelMap model){
		
		List<Employee> employees = empService.findAllEmployees();
		model.addAttribute("employees", employees);
		
		return "allemployees";
	}
	
	@RequestMapping(value={"/new"}, method =RequestMethod.GET)
	public String newEmployee(ModelMap model){
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		model.addAttribute("edit", false);
		
		return "registration";
	}
	
	@RequestMapping(value={"/new"}, method = RequestMethod.POST)
	public String saveEmployee(@Valid Employee employee, BindingResult result, ModelMap model){
		if (result.hasErrors())
			return "registration";
		
		if(!empService.isEmployeeSsnUnique(employee.getIdemployee(), employee.getSsn())){
			FieldError ssnError = new FieldError("employee", "ssn", messageSource.getMessage("non.unique.ssn", new String[]{employee.getSsn()}, Locale.getDefault()));
			result.addError(ssnError);
			
			return "registration";
		}
		
		empService.saveEmployee(employee);
		
		model.addAttribute("success", "Employee" + employee.getfName() +  " registered succesfully");
		
		return "success";
		
	}
}
