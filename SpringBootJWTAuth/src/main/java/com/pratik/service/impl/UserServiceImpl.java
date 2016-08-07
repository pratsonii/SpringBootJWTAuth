package com.pratik.service.impl;

import com.pratik.domain.entity.User;
import com.pratik.repository.UserRepository;
import com.pratik.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nasir on 6/2/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUserName(username);
    }
}
