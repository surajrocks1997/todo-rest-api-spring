package com.todo.backendAPI.todoRestApi.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    
//    {
//        	"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU5NDIwNTAzNSwiaWF0IjoxNTkzNjAwMjM1fQ.-cpiZc89KW2RXXl2QNW4sbzktNm6t6JmXA7m6CJ5RQdL6mCIR-06cqTmTdHktxIfan0W7ASkdKKXKjOzYz1JaQ"
//    }

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

