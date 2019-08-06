package com.appchat.socket.model;

//import org.graalvm.compiler.lir.CompositeValue;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_profile")
public class TableUserProfile {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
//    private String nickname;
    private String avatar;
    @CreatedDate
    @Generated(value = GenerationTime.INSERT)
    private Date createdTime;

    public TableUserProfile(String username, String password, String full_name, String avatar, Date createdTime) {
        this.username = username;
        this.password = password;
//        this.nickname = full_name;
        this.avatar = avatar;
        this.createdTime = createdTime;
    }

    public TableUserProfile() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
