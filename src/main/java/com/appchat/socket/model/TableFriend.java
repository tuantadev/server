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
    private int sender_id;
    private int receive_id;
//    private boolean isAccept;
    @CreatedDate
    @Generated(value = GenerationTime.INSERT)
    private Date created_time;

    public TableFriend(int sender_id, int receive_id, Date created_time) {
        this.sender_id = sender_id;
        this.receive_id = receive_id;
//        this.isAccept = isAccept;
        this.created_time = created_time;
    }

    public TableFriend() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSender_id() {
        return sender_id;
    }

    public void setSender_id(int sender_id) {
        this.sender_id = sender_id;
    }

    public int getReceive_id() {
        return receive_id;
    }

    public void setReceive_id(int receive_id) {
        this.receive_id = receive_id;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }
}
