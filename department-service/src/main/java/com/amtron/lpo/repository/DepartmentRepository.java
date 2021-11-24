package com.amtron.lpo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amtron.lpo.entity.Department;

@Repository
public interface DepartmentRepository extends MongoRepository<Department, Long> {

	Department findByDepartmentId(Long departmentId);

}
