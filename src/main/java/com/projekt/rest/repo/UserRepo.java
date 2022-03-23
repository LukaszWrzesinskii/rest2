package com.projekt.rest.repository;

import com.projekt.rest.models.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<user, Long> {
}