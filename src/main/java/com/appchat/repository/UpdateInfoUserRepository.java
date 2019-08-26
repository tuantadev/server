//package com.appchat.repository;
//
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface UpdateInfoUserRepository {
//    @Modifying(clearAutomatically = true)
//    @Query(nativeQuery = true,
//            value = "update user_profile " +
//            "set phonenumber =:phonenumber,avatar :=avatar " +
//            "where id =:id")
//    void updateInfoUser(
//            @Param(value = "phonenumber") String phonenumber,
//            @Param(value = "avatar") String avatar
//    );
//}
