package com.amtron.lpo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amtron.lpo.entity.Department;
import com.amtron.lpo.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController{

	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		System.out.println("Inside saveDepartment in DepartmentController");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{id}")
	public Department findDepartmentById(@PathVariable("id") Long departmentId) {
		System.out.println("Inside findDepartmentById in DepartmentController");
		return departmentService.findDepartmentById(departmentId);
	}
	
	@GetMapping("/getAllDepartmentsList")
	public List<Department> getAllDepartments(){
		System.out.println("Inside getAllDepartments in DepartmentController");
		return departmentService.getAllDepartments();
	}
}
