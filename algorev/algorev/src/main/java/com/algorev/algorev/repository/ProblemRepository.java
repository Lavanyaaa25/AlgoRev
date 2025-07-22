package com.algorev.algorev.repository;

import com.algorev.algorev.entity.Problem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProblemRepository extends MongoRepository<Problem, String> {

}
