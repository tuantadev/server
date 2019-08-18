package com.appchat.socket.repository;

import com.appchat.socket.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepositiory extends JpaRepository<Message, Integer> {



}
