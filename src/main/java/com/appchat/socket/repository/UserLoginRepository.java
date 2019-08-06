package com.appchat.socket.repository;

import com.appchat.socket.model.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginRepository extends JpaRepository<UserLogin,Integer> {

}
