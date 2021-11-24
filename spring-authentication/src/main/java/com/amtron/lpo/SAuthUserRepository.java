package com.amtron.lpo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SAuthUserRepository extends MongoRepository<SAuthUser, Long>{

	SAuthUser findByUserName(String userName);
}
