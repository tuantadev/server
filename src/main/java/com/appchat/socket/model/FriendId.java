package com.appchat.socket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

public class FriendId {
   private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
