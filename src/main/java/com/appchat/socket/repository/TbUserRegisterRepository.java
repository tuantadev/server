package com.appchat.socket.repository;

import com.appchat.socket.model.TableUserRegister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbUserRegisterRepository extends JpaRepository<TableUserRegister,Integer> {

}
