package com.springpractice.SpringSecurityDemo.dao;

import com.springpractice.SpringSecurityDemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUsername(String username);
}
