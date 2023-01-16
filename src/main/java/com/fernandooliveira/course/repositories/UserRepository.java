package com.fernandooliveira.course.repositories;

import com.fernandooliveira.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
