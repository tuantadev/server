package com.appchat.repository;

import com.appchat.model.request.RegisterRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Configuration
@Repository
@EnableJpaRepositories
public interface RegisterRepository extends JpaRepository<RegisterRequest,Integer> {
    @Modifying(clearAutomatically = true)
    @Query(nativeQuery = true,
            value = "insert into user_profile(username,password,nameofchat) " +
                    "values(:username,:password,:nameofchat)"
    )
    void insertNewUser(
            @Param(value = "username") String username,
            @Param(value = "password") String password,
            @Param(value = "nameofchat") String nameofchat
    );
}
