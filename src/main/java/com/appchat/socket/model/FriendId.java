package com.appchat.socket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

public class FriendId {
    private int senderId;
    private int receiverId;

    public int getSenderId() {
        return senderId;
    }

    public void setSenderId(int senderId) {
        this.senderId = senderId;
    }

    public int getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
    }
}
