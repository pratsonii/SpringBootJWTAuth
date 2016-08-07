package com.pratik.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratik.domain.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

  public User findByUserName(String username);

}
