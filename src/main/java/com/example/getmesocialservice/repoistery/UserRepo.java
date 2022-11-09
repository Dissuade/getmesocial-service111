package com.example.getmesocialservice.repoistery;

import com.example.getmesocialservice.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepo {
    public User getUser() {
        User user=new User("gurpreet","surrey,BC",12,"dcggd/dhdh");
                return user;
    }
}
