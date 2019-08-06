package com.appchat.socket.repository;

import com.appchat.socket.model.TableUserProfile;
import com.appchat.socket.model.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRepository
        extends JpaRepository<TableUserProfile, Integer> {
    //
//    @Query(nativeQuery = true, value = "SELECT * FROM user_profile WHERE " + "username = :username LIMIT 1")
//    TableUserProfile findOneByUsername(@Param(value = "username") String username);
//
//        @Query(nativeQuery = true,
//    value = "SELECT * FROM user_profile WHERE id not in :ids")
//    List<TableUserProfile> findAllNotFriend(
//            @Param(value = "ids") List<Integer> ids
//    );
    TableUserProfile findByUsername(String username);

}
