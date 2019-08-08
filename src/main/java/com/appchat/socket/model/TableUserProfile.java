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
    private String nameofchat;
    @CreatedDate
    @Generated(value = GenerationTime.INSERT)
    private Date date_created;
    public TableUserProfile(String username, String password, String avatar,String nameofchat, Date date_created) {
        this.username = username;
        this.password = password;
        this.avatar = avatar;
        this.nameofchat = nameofchat;
        this.date_created = date_created;
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
    public String getNameofchat() {
        return nameofchat;
    }

    public void setNameofchat(String nameofchat) {
        this.nameofchat = nameofchat;
    }

    public Date getDate_created() {
        return date_created;
    }

    public void setDate_created(Date date_created) {
        this.date_created = date_created;
    }
}
