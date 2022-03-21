package com.projekt.rest.repository;

import com.projekt.rest.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}