package com.example.getmesocialservice.service;

import com.example.getmesocialservice.User;
import com.example.getmesocialservice.repoistery.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
    public User getUser() {
        return userRepo.getUser();
    }
}
