package com.amtron.lpo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.amtron.lpo.entity.User;
import com.amtron.lpo.repository.UserRepository;
import com.amtron.lpo.vo.Department;
import com.amtron.lpo.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user) {
		System.out.println("Inside saveUser in UserService");
		return userRepository.save(user);
	}
	
	public ResponseTemplateVO getUserWithDepartment(Long userPk) {
		System.out.println("Inside getUserWithDepartment in UserService");
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findByUserPk(userPk);
		System.out.println(user.getUserName() + "inside");
		
		Department department = restTemplate.getForObject( "http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);
		
		vo.setUser(user);
		vo.setDepartment(department);
		
		return vo;
	}

	public List<User> getAllUsersList() {
		return userRepository.findAll();
	}
}
