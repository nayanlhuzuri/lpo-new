package com.amtron.lpo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.amtron.lpo.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long>{

		User findByUserPk(Long userPk);

}
