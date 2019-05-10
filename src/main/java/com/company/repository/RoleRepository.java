package com.company.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.company.model.Role;
@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role,Integer>{
Role findByRole(String role);
}
