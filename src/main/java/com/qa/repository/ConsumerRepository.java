package com.qa.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qa.entity.SentUser;

@Repository
public interface ConsumerRepository extends MongoRepository<SentUser, Long>{

}

