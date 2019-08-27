package com.spring.boot.repo;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.model.UserRecord; 

public interface UserRepository extends CrudRepository<UserRecord, String> {  

}
