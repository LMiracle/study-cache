package com.miracle.studycache.service;

import com.miracle.studycache.domain.User;

import java.util.List;

/**
 * @author Miracle
 * @date 2020/4/15 23:43
 */
public interface UserService {

    /**
     * 获取全部用户信息
     * @return
     */
    List<User> getAllUser();

    /**
     * 获取用户名
     * @param username 用户名
     * @return
     */
    User getUser(String username);

    /**
     * 修改用户
     * @param user 用户
     */
    User updateUser(User user);

    /**
     * 保存用户
     * @param user 用户
     */
    User saveUser(User user);

    /**
     * 删除用户
     * @param username
     * @return
     */
    void deleteUser(String username);

    /**
     * 清楚所有用户
     * @return
     */
    void clearCache();
}
