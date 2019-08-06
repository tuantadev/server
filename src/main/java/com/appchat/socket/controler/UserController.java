package com.appchat.socket.controler;

import com.appchat.socket.model.TableUserProfile;
import com.appchat.socket.model.UserLogin;
import com.appchat.socket.repository.UserLoginRepository;
import com.appchat.socket.repository.UserProfileRepository;
import com.appchat.socket.repository.UserRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Hashtable;
import java.util.List;
import java.util.NoSuchElementException;

@Controller
@RequestMapping(path = "/users") //http://localhost:8888/users
public class UserController {
    @Autowired
    private UserProfileRepository userProfileRepository;
    @PostMapping(path = "/userDetail")
    public @ResponseBody Hashtable getUserDetail(@RequestParam String username) {
        Hashtable<String, Object> response = new Hashtable<>();
        TableUserProfile tableUserProfile = userProfileRepository.findByUsername(username);
        if (tableUserProfile == null || !tableUserProfile.getPassword().equals(username)) {
            response.put("result", "Username and password invalid");
            response.put("data", tableUserProfile);
        }
        return response;
    }
//    @Autowired
//    private UserRegisterRepository userRegisterRepository;
//    @PostMapping(path = "/register") //http://localhost:8888/users/register
//    public @ResponseBody Hashtable registerUser(@RequestParam String username,
//                                                @RequestParam String password){
//        Hashtable<String,Object> response = new Hashtable<>();
//        //check trùng username khong
//        List<UserRegister> foundUsername = userRegisterRepository.findByEmail(username);
//        if (foundUsername.size() >0){
//                response.put("result","ok");
//                response.put("data",foundUsername.get(0));
//                response.put("messeage","Login user successfully");
//                return response;
//            }else {
//                response.put("result","false");
//                response.put("message","User already exists");
//                return response;
//            }

//        UserRegister userRegister = new UserRegister(username,password);
//        userRegisterRepository.save(userRegister);
//        response.put("result","ok");
//        response.put("data",userRegister);
//        response.put("message","Register user successfully");
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
