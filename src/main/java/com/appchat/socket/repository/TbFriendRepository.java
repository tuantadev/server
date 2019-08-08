package com.appchat.socket.repository;


import com.appchat.socket.model.FriendId;
import com.appchat.socket.model.TableFriendResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TbFriendRepository extends JpaRepository<TableFriendResponse, Integer> {
    @Query(nativeQuery = true,
            value = "SELECT " +
                    "friend.id as id, "+
                    "user_profile.id as friend_id, "+
                    "user_profile.nameofchat as friend_nameofchat, "+
                    "user_profile.username as friend_username, "+
                    "user_profile.avatar as friend_avatar, "+
                    "friend.created_time as created_time " +
                    "FROM " +
                    "friend JOIN user_profile ON " +
                 "(friend.sender_id = :userId AND friend.receive_id = user_profile.id)OR "+
                    "(friend.receive_id = :userId AND friend.sender_id = user_profile.id) "
    )
    List<TableFriendResponse> findAllFriend(
            @Param(value = "userId") int userId
    );
    TableFriendResponse findById(int id);
}
