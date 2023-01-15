package com.driver.services;

import com.driver.models.*;
import com.driver.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    static
    UserRepository userRepository3;

    @Autowired
    BlogService blogService3;

    public void createUser(User user){
    }

    public void deleteUser(int userId){
    }

    public void updateUser(User user){
        userRepository3.save(user);
    }

    public static User findUserByUsername(String username){
        return userRepository3.findByUsername(username);
    }
}
