package com.company.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.company.model.User;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
