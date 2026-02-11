package com.example.modulith.application.module;

import com.example.modulith.generic.user.User;
import org.springframework.stereotype.Service;

@Service
public class SomeService {

  public User getUser() {
    return new User("John Doe");
  }

}
