package com.upgrad.futbol.service;

import com.upgrad.futbol.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public boolean login(User user){
        if(user.getUsername().equals("admin") && user.getPassword().equals("admin123")){
            return true;
        }else{
            return false;
        }

    }
}
