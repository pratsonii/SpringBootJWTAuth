package com.pratik.model.factory;

import com.pratik.domain.entity.User;
import com.pratik.model.security.SecurityUser;

import org.springframework.security.core.authority.AuthorityUtils;

public class UserFactory {

  public static SecurityUser create(User user) {
    return new SecurityUser(
      user.getUserId(),
      user.getUserName(),
      user.getPassword(),
      user.getAuthority()
    );
  }

}
