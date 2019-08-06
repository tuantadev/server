package com.appchat.socket.model;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "friend")
public class TableFriend {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name = "sender_id")
    private int senderId;
    @Column(name = "receiver_id")
    private int receiverId;
    @Column(name = "is_accept")
    private boolean isAccept;
    @Column(name = "created_time")
    @CreatedDate
    @Generated(value = GenerationTime.INSERT)
    private Date createdTime;

    public TableFriend(int senderId, int receiverId, boolean isAccept, Date createdTime) {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.isAccept = isAccept;
        this.createdTime = createdTime;
    }

    public TableFriend() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public boolean isAccept() {
        return isAccept;
    }

    public void setAccept(boolean accept) {
        isAccept = accept;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
