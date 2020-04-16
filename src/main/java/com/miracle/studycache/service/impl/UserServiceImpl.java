package com.miracle.studycache.service.impl;

import com.miracle.studycache.dao.UserDao;
import com.miracle.studycache.domain.User;
import com.miracle.studycache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Miracle
 * @date 2020/4/15 23:46
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Cacheable("userList")
    public List<User> getAllUser() {
        return userDao.findAll();
    }

    @Override
    @Cacheable(value = "userData", key = "#username")
    public User getUser(String username) {

        Optional<User> userOptional = userDao.findById(username);
        if (userOptional.isEmpty()){
            return null;
        }
        return userOptional.get();
    }
}
