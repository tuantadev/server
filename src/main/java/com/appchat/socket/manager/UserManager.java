package com.appchat.socket.manager;

import com.appchat.socket.model.UserLogin;
import com.appchat.socket.repository.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManager {
    @Autowired
    private UserLoginRepository userLoginRepository;
    public Object login(String username){
         UserLogin userLogin =userLoginRepository.findByUsername(username);
         return userLogin;
    }
}
