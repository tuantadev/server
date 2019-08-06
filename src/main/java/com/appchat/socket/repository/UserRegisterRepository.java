package com.appchat.socket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRegisterRepository extends JpaRepository<UserRegister, Integer> {
    List<UserRegister> findByEmail(String email);
    UserRegister findByEmailAndPassword(String email,String password);

}
