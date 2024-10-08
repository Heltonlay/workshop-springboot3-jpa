package com.danielpsilva.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielpsilva.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
