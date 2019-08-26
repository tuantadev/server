package com.appchat.controler;

import com.appchat.component.UserManager;
import com.appchat.model.data.UpdateInfoUser;
import com.appchat.model.request.LoginRequest;
import com.appchat.model.request.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/users")
public class UserController {
    @Autowired
    private UserManager userManager;

    @PostMapping(path = "/login")
    public Object login(
            @RequestBody LoginRequest login) {
        return userManager.login(login);
    }

    @PostMapping(path = "/register")
    public Object register(
            @RequestBody RegisterRequest registerRequest){
        return userManager.register(registerRequest);
    }

    @GetMapping(path = "/getAllFriend")
    public Object getAllFriend(
            @RequestParam int userId
    ) {
        return userManager.getAllFriends(userId);
    }

    @GetMapping(path = "/getHistoryChat")
    public Object getHistoryChat(
            @RequestParam("senderId") int senderId,
            @RequestParam("receiverId") int receiverId
    ) {
        return userManager.getHistoryChat(senderId, receiverId);
    }

//    @PostMapping(path = "updateInfoUser")
//    public Object updateInfoUser (
//            @RequestBody UpdateInfoUser updateInfoUser){
//        return userManager.updateInfoUser(updateInfoUser);
//    }
}
