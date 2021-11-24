package com.amtron.lpo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amtron.lpo.entity.Department;
import com.amtron.lpo.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	public Department saveDepartment(Department department) {
		System.out.println("Inside saveDepartment in DepartmentService");
		return departmentRepository.save(department);
		
	}

	public Department findDepartmentById(Long departmentId) {
		System.out.println("Inside findDepartmentById in DepartmentService");
		return departmentRepository.findByDepartmentId(departmentId);
	}

	public List<Department> getAllDepartments() {
		System.out.println("Inside getAllDepartments in DepartmentService");
		return departmentRepository.findAll();
	}
}
