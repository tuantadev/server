package com.appchat.socket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table( name= "friend_response")
public class TableFriendResponse {
    @Id
    private int id;
    @Column(name = "friend_id")
    private int friendId;
    @Column(name = "friend_nameofchat")
    private String friendNameofchat;
    @Column(name = "friend_username")
    private String friendUsername;
    @Column(name = "friend_avatar")
    private String friendAvatar;
    @Column(name = "created_time")
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

    public String getFriendNameofchat() {
        return friendNameofchat;
    }

    public void setFriendNameofchat(String friendNameofchat) {
        this.friendNameofchat = friendNameofchat;
    }

    public String getFriendUsername() {
        return friendUsername;
    }

    public void setFriendUsername(String friendUsername) {
        this.friendUsername = friendUsername;
    }

    public String getFriendAvatar() {
        return friendAvatar;
    }

    public void setFriendAvatar(String friendAvatar) {
        this.friendAvatar = friendAvatar;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
