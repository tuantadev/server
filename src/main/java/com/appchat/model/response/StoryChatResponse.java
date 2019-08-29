package com.appchat.model.response;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "story_chat")
public class StoryChatResponse {
    @Id
    private int id;
   @Column(name = "friend_id")
   private int friend_id;
    private String friend_avatar;
    private String friend_image;
    private String friend_video;
    private String friend_namofchat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFriend_id() {
        return friend_id;
    }

    public void setFriend_id(int friend_id) {
        this.friend_id = friend_id;
    }

    public String getFriend_avatar() {
        return friend_avatar;
    }

    public void setFriend_avatar(String friend_avatar) {
        this.friend_avatar = friend_avatar;
    }

    public String getFriend_image() {
        return friend_image;
    }

    public void setFriend_image(String friend_image) {
        this.friend_image = friend_image;
    }

    public String getFriend_video() {
        return friend_video;
    }

    public void setFriend_video(String friend_video) {
        this.friend_video = friend_video;
    }

    public String getFriend_namofchat() {
        return friend_namofchat;
    }

    public void setFriend_namofchat(String friend_namofchat) {
        this.friend_namofchat = friend_namofchat;
    }
}
