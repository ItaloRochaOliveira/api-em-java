package edu.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.api.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
