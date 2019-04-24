package com.beacon.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComplianceExceptionController {

	@Autowired
	Reppo repo;

	@GetMapping("/getName")
	public String getName() {
		return "Priya";
	}

	@GetMapping("/getAll")
	public List<Demo> getAll() {
		return repo.findAll();
	}

	@Autowired
	private DepartmentRepository departmentRepository;

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("findUserByEmpId/{emp_id}")
	public List<User> findUserByEmpId(@PathVariable int emp_id){
		return employeeRepository.findUserByEmpId(emp_id);
	}
	@GetMapping("/findByEmployeeId/{emp_id}") //not
	public List<Employee> findByEmployeeId(@PathVariable int emp_id) {
		return employeeRepository.findByEmployeeId(emp_id);
	}

	@GetMapping("/findByEmpDepartmentId/{id}")
	public List<String> findByEmpDepartmentId(@PathVariable int id) {
		List<Employee> empList = employeeRepository.findByDepartmentId(id);
		return empList.stream().map(e -> e.getName()).distinct().collect(Collectors.toList());
	}

	@GetMapping("findByDepartmentId/{id}")
	public Department getUser(@PathVariable int id) {
		Department user = departmentRepository.findById(id).get();
		System.out.println(user.toString());
		return user;
	}

	@GetMapping("findById/{id}")
	public Employee findById(@PathVariable int id) {
		Employee user = employeeRepository.findById(id).get();
		System.out.println(user.toString());
		return user;
	}
	@GetMapping("findUserByDepartmentId/{id}")
	public List<User> findUserByDepartmentId(@PathVariable int id){
		return employeeRepository.findUserByDepartmentId(id);
	}

}
