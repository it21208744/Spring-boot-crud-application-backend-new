package com.the_polar_lights.spring_boot_crud_app.repository;

import com.the_polar_lights.spring_boot_crud_app.Entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<userEntity, Long> {


    //Find user by email using custom query
    userEntity findByEmail(String email);

}
