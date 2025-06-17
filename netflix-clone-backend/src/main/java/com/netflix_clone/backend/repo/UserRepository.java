package com.netflix_clone.backend.repo;

import com.netflix_clone.backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
