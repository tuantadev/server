package com.appchat.socket.repository;


import com.appchat.socket.model.TableFriend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FriendRepository extends JpaRepository<TableFriend, Integer> {
    @Query(nativeQuery = true,
            value = "SELECT " +
                    "friend.id as id, "+
                    "user_profile.id as friend_id, "+
                    "user_profile.nameofchat as friend_namofchat, "+
                    "user_profile.username as friend_username, "+
                    "user_profile.avatar as friend_avatar, "+
                    "FROM " +
                    "friend JOIN user_profile ON " +
                    "(friend.sender_id = :userId AND friend.receiver_id = user_profile.id) OR "+
                    "(friend.receiver_id = :userId AND friend.sender_id = user_profile.id) "
    )
    List<TableFriend> findAllFriend(
            @Param(value = "userId") int userId
    );
}
