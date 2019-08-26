package com.appchat.component;

import com.appchat.model.data.UserProfile;
import com.appchat.model.request.RegisterRequest;
import com.appchat.model.response.BaseResponse;
import com.appchat.repository.*;
import com.appchat.model.request.LoginRequest;
import com.appchat.model.response.FriendResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class UserManager {
    @Autowired
    private UserProfileRepository userProfileRepository;
    @Autowired
    private FriendRepository friendRepository;
    @Autowired
    private MessageChatResponseRepository messageChatResponseRepository;
    @Autowired
    private RegisterRepository registerRepository;
//    @Autowired
//    private UpdateInfoUserRepository updateInfoUserRepository;

    public Object login(LoginRequest loginRequest) {
        UserProfile userProfile = userProfileRepository.findByUsername(loginRequest.getUsername());
        if (userProfile == null || !userProfile.getPassword().equals(loginRequest.getPassword())) {
            return BaseResponse.createResponse(0, "username or password is invalid");
        }
        return BaseResponse.createResponse(userProfile);
    }

    public Object getAllFriends(int userId) {
        List<FriendResponse> friends = friendRepository.findAllFriend(userId);
        if (friends == null) {
            return BaseResponse.createResponse(0, "id invalid");
        }
        return BaseResponse.createResponse(friends);
    }

    @Transactional
    public Object register(RegisterRequest registerRequest){
        UserProfile userProfile = userProfileRepository.findByUsername(registerRequest.getUsername());
        if (userProfile != null)
            return BaseResponse.createResponse(0, "username is existed");
        registerRepository.insertNewUser(registerRequest.getUsername(),registerRequest.getPassword());
        registerRepository.save(registerRequest);
        return BaseResponse.createResponse(1,"register is successful");
    }

    public Object getHistoryChat(int senderId, int receiverId) {
        return BaseResponse.createResponse(messageChatResponseRepository.getHistoryMessage(senderId, receiverId));
    }

//    public Object updateInfoUser(UpdateInfoUser updateInfoUser){
//        updateInfoUserRepository.updateInfoUser(updateInfoUser.getNumberphone(),updateInfoUser.getAvatar());
//        UserProfile userProfile = userProfileRepository.findById(updateInfoUser.getId());
//        return userProfile;
//    }
}
