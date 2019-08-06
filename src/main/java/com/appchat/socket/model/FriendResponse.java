package com.appchat.socket.model;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class FriendResponse {
    @Id
    private int id;
    @Column(name = "friend_id")
    private int friendId;
    @Column(name = "friend_name")
    private String friendName;
    @Column(name = "friend_avata")
    private String friendAvata;
    @Column(name = "friend_username")
    private String friendUsername;
    @Column(name = "create_time")
    private Date createdTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFriendId() {
        return friendId;
    }

    public void setFriendId(int friendId) {
        this.friendId = friendId;
    }

    public String getFriendName() {
        return friendName;
    }

    public void setFriendName(String friendName) {
        this.friendName = friendName;
    }

    public String getFriendAvata() {
        return friendAvata;
    }

    public void setFriendAvata(String friendAvata) {
        this.friendAvata = friendAvata;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getFriendUsername() {
        return friendUsername;
    }

    public void setFriendUsername(String friendUsername) {
        this.friendUsername = friendUsername;
    }
}
