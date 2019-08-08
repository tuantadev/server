package com.appchat.socket.controler;

import com.appchat.socket.component.UserManager;
import com.appchat.socket.model.FriendId;
import com.appchat.socket.model.LoginRequest;
import com.appchat.socket.repository.TbFriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/users") //http://3.1.211.156:8888/users
public class UserController {
    @Autowired
    private UserManager userManager;
    @Autowired
    private TbFriendRepository friendRepository;
    @PostMapping(path = "/login") //http://3.1.211.156:8888/users/login
    public Object login(
            @RequestBody LoginRequest login) {
        return userManager.login(login);
    }
    @GetMapping(path = "/getAllFriend")
    public Object getAllFriend(
            @RequestParam FriendId userId
    ) {
//        return friendRepository.findAllFriend(userId);
        return userManager.getAllFriends(userId);
    }









//    @PostMapping(path = "/register") //http://3.1.211.156:8888/users/register
//    public @ResponseBody
//    Hashtable registerUser(@RequestParam String username,
//                           @RequestParam String password){
//        Hashtable<String,Object> response = new Hashtable<>();
//
//    }
//    @PostMapping(path = "/userDetail")
//    public @ResponseBody Hashtable getUserDetail(@RequestParam String username) {
//        Hashtable<String, Object> response = new Hashtable<>();
//        TableUserProfile tableUserProfile = userProfileRepository.findByUsername(username);
//        if (tableUserProfile == null || !tableUserProfile.getPassword().equals(username)) {
//            response.put("result", "Username and password invalid");
//            response.put("data", tableUserProfile);
//        }
//        return response;
//    }
//    @PostMapping(path = "/login") //http://localhost:8888/users/login
//    public @ResponseBody
//    Hashtable login(@RequestParam String email
//            ,@RequestParam String password
//            ,@RequestParam String userType) {
//        Hashtable<String, Object> response = new Hashtable<>();
//        try {
//            if (userType.equals("facebook")){
//                List<UserRegister> foundUsersFacebook = userRegisterRepository.findByEmail(email);
//                if(foundUsersFacebook.size()>0){
//                    response.put("result", "ok");
//                    response.put("data", foundUsersFacebook.get(0));
//                    response.put("message", "Login user facebook successfully");
//
//                }else {
//                    response.put("result", "false");
//                    response.put("message", "Cannot find user facebook "+email);
//                }
//            }
//            UserRegister foundUsername = userRegisterRepository.findByEmailAndPassword(email,password);
//            if (foundUsername.equals(email)) {
//                response.put("result", "email");
//                response.put("data", foundUsername);
//                response.put("message", "Login user facebook successfully");
//            }
//
//        } catch (NoSuchElementException exception) {
//            response.put("result", "failse");
//            response.put("message", "Cannot find Username. Error" + exception.toString());
//        } finally {
//            return response;
//        }
//    }
}
