package com.pratik.service;

import java.util.List;

import com.pratik.domain.entity.User;

/**
 * Created by nasir on 6/2/16.
 */
public interface UserService {

    List<User> getAllUsers();
    User getUserByUsername(String username);
}
