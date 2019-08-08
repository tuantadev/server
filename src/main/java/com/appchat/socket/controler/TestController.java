//package com.appchat.socket.controler;
//
//import com.appchat.socket.model.*;
//import com.appchat.socket.repository.FriendIdRepository;
//import com.appchat.socket.repository.FriendRepository;
//import com.appchat.socket.repository.UserProfileRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.repository.query.Param;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.Hashtable;
//import java.util.List;
//import java.util.NoSuchElementException;
//
//@RestController
//@RequestMapping(path = "/test")
//public class TestController {
//    @Autowired
//    private UserProfileRepository userProfileRepository;
//    @Autowired
//    private FriendRepository friendResponseRepository;
//    @Autowired
//    private FriendIdRepository friendIdRepository;
////    @Autowired
////    private TestRepository testRepository;
//
//    @GetMapping(value = "/getAllUser")
//    public Object getAllUser() {
//        return userProfileRepository.findAll();
//    }
//
//    @GetMapping(value = "/getAllFriend")
//    public Object getAllFriend(
//            @RequestParam int id
//    ) {
//        return friendResponseRepository.findAllFriend(id);
//    }
//
//    @GetMapping(value = "/GetAllNotFriend")
//    public Object getAllNotFriend(
//            @RequestParam int id
//    ) {
//        List<FriendId> friendIds = friendIdRepository.findAllNotFriend(id);
//        List<Integer> fIds = new ArrayList<>();
//        for (FriendId friendId : friendIds) {
//            if (friendId.getReceiverId() == id) {
//                fIds.add(friendId.getSenderId());
//            } else {
//                fIds.add(friendId.getReceiverId());
//            }
//        }
//        return userProfileRepository.findAllNotFriend(fIds);
//
//    }
//
//    @PostMapping(value = "/login")
//    public BaseResponse login(
//            @RequestBody LoginRequest login
//    ) {
//        TableUserProfile userProfile = userProfileRepository.findOneByUsername(login.getUsername());
//        if (userProfile == null || !userProfile.getPassword().equals(login.getPassword())) {
//            return BaseResponse.createResponse(0, "username or password invalid");
//        }
//        return BaseResponse.createResponse(userProfile);
//    }
//
//    @PostMapping(path = "/add")  //http://localhost:8888/test/add
//    public @ResponseBody
//    Hashtable addTest(@RequestParam String productName,
//                      @RequestParam Integer productYear,
//                      @RequestParam Double price,
//                      @RequestParam String productDescription,
//                      @RequestParam Integer userId) {
//        Hashtable<String, Object> response = new Hashtable<>();
//        Test test = new Test(productName, productYear, price, productDescription, userId);
//        testRepository.save(test);
//        response.put("resutl", "ok");
//        response.put("data", test);
//        response.put("message", "Add new test successfully");
//        return response;
//    }
//
//    @GetMapping(path = "/all")  //http://localhost:8888/test/all
//    public @ResponseBody
//    Hashtable getAllProducts(@RequestParam Integer userId) {
//        Hashtable<String, Object> response = new Hashtable<>();
//        List<Test> findAll = testRepository.findByUserId(userId);
//        if (findAll.size() > 0) {
//            response.put("resutl", "ok");
//            response.put("data", findAll);
//            response.put("message", "Query test successfully");
//            return response;
//        } else {
//            response.put("result", "false");
//            response.put("message", "Query test not exists");
//            return response;
//        }
//    }
//
//    @GetMapping(path = "/detailTest") //http://localhost:8888/test/detailTest
//    public @ResponseBody
//    Hashtable getDetail(@RequestParam Integer id) {
//        Hashtable<String, Object> response = new Hashtable<>();
//        try {
//            Test detailTest = testRepository.findById(id).get();
//            response.put("result", "ok");
//            response.put("data", detailTest);
//            response.put("message", "Query test successfully");
//        } catch (NoSuchElementException exception) {
//            response.put("result", "false");
//            response.put("message", "Cannot find test with id = " + id);
//        } finally {
//            return response;
//        }
//    }
//
//}
