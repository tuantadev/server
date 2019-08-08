package com.appchat.socket.component;

import com.appchat.socket.model.BaseResponse;
import com.appchat.socket.model.LoginRequest;
import com.appchat.socket.model.TableUserProfile;
import com.appchat.socket.repository.TbUserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManager {
    @Autowired
    private TbUserProfileRepository tbUserProfileRepository;
    public Object login(LoginRequest loginRequest){
         TableUserProfile tableUserProfile = tbUserProfileRepository.findByUsername(loginRequest.getUsername());
         if (tableUserProfile == null || !tableUserProfile.getPassword().equals(loginRequest.getPassword())){
             return BaseResponse.createResponse(0,"username or password is invalid");
         }
         return BaseResponse.createResponse(tableUserProfile);
    }

}
