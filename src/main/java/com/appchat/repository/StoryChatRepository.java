package com.appchat.repository;

import com.appchat.model.response.StoryChatResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoryChatRepository extends JpaRepository<StoryChatResponse,Integer> {
//    @Query(nativeQuery = true,
//    value = "SELECT friend.id as id" +
//            ",user_profile.id = friend_id" +
//            ",user_profile.avatar as friend_avatar" +
//            ",friend")
}
