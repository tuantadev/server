package com.appchat.socket.component;

import com.appchat.socket.model.*;
import com.appchat.socket.repository.TbFriendRepository;
import com.appchat.socket.repository.TbUserProfileRepository;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManager {
    @Autowired
    private TbUserProfileRepository tbUserProfileRepository;
    @Autowired
    private TbFriendRepository tbFriendRepository;

    public Object login(LoginRequest loginRequest) {
        TableUserProfile tableUserProfile = tbUserProfileRepository.findByUsername(loginRequest.getUsername());
        if (tableUserProfile == null || !tableUserProfile.getPassword().equals(loginRequest.getPassword())) {
            return BaseResponse.createResponse(0, "username or password is invalid");
        }
        return BaseResponse.createResponse(tableUserProfile);
    }

    public Object getAllFriends(FriendId friendId) {
        TableFriendResponse tableFriendResponse = tbFriendRepository.findById(friendId.getUserId());
        if (tableFriendResponse == null) {
            return BaseResponse.createResponse(0, "id invalid");
        }
        return BaseResponse.createResponse(tableFriendResponse);
    }
}
