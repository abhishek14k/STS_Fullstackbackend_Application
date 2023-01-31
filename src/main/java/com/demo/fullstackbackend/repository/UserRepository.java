package com.demo.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
