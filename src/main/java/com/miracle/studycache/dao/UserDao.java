package com.miracle.studycache.dao;

import com.miracle.studycache.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, String> {
}
