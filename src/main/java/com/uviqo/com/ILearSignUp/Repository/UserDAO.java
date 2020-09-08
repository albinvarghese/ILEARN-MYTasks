package com.uviqo.com.ILearSignUp.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uviqo.com.ILearSignUp.Model.User;


@Repository
public interface UserDAO extends JpaRepository<User, Long> {

	   User findByUsername(String username);

	    User findByEmail(String email);
}

