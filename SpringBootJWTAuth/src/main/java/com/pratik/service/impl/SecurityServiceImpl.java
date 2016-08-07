package com.pratik.service.impl;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.pratik.service.SecurityService;

@Service
public class SecurityServiceImpl implements SecurityService {

  @Override
  public Boolean hasProtectedAccess() {
    return (SecurityContextHolder.getContext().getAuthentication().getAuthorities().contains(new SimpleGrantedAuthority("ADMIN")));
  }

}
