package com.appchat.repository;

import com.appchat.model.data.FriendToAdd;
import com.appchat.model.response.FriendResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FindNotFriendRepository extends JpaRepository<FriendToAdd,Integer> {
    @Query(nativeQuery = true,
            value = "SELECT id,sender_id, receive_id " +
                    "FROM friend " +
                    "WHERE sender_id = :userId OR " +
                    "receive_id = :userId")
    List<FriendToAdd> findAllNotFriend(
            @Param(value = "userId") int userId
    );
}
