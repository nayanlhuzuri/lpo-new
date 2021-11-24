package com.amtron.lpo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amtron.lpo.entity.User;
import com.amtron.lpo.service.UserService;
import com.amtron.lpo.vo.ResponseTemplateVO;


@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		System.out.println("Inside saveUser in userService");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{userPk}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("userPk") Long userPk) {
		System.out.println("Inside getUserWithDepartment in UserController");
		return userService.getUserWithDepartment(userPk);
	}
	
	@GetMapping("/getAllUsersList")
	public List<User> getAllUsersList(){
		System.out.println("Inside getAllDepartments in DepartmentController");
		return userService.getAllUsersList();
	}
}
