package com.pratik.domain.entity;

import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "USER_NAME",unique=true)
	private String userName;
	
	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "ROLE")
	private String role;
	
	public int getUserId() {
		return userId;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getRole() {
		return "ADMIN";
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	   public List<GrantedAuthority> getAuthority() {
	        return AuthorityUtils.createAuthorityList(this.getRole());
	   }

  public User() {
    super();
  }

  public User(String username, String password, String email, Date lastPasswordReset, String authorities) {
    this.setUserName(username);
    this.setPassword(password);
    this.setRole(authorities);
   
  }


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


  

}
