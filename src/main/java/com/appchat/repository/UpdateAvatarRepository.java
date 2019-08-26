package com.appchat.repository;

import com.appchat.model.data.UpdateAvatar;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Configuration
@Repository
@EnableJpaRepositories
public interface UpdateAvatarRepository extends JpaRepository<UpdateAvatar,Integer> {
    @Modifying(clearAutomatically = true)
    @Query(nativeQuery = true,
            value = "update user_profile " +
            "set avatar =:avatar " +
            "where id =:id")
    @Transactional
    void updateAvatar(
            @Param(value = "avatar") String avatar,
            @Param(value = "id") int id
    );
}
