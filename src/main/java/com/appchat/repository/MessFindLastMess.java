package com.appchat.repository;

import com.appchat.model.response.MessageChatResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessFindLastMess extends JpaRepository<MessageChatResponse,Integer> {
    @Query(nativeQuery = true,
            value = "SELECT id, sender_id,  " +
                    "receiver_id, " +
                    "content, " +
                    "type, " +
                    "created_time " +
                    "FROM message WHERE " +
                    "(sender_id = :senderId AND receiver_id = :receiverId) OR " +
                    "(sender_id = :receiverId AND receiver_id = :senderId) " +
                    "ORDER BY id desc limit 1"
    )
    MessageChatResponse getLastMess(
            @Param(value = "senderId") int senderId,
            @Param(value = "receiverId") int receiverId
    );
}
