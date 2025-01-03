package com.springpractice.SpringBootRest.repo;

import com.springpractice.SpringBootRest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
