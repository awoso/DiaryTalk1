package com.semicolonAfrica.DiaryTalk.data.repository;


import com.semicolonAfrica.DiaryTalk.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);

    User findUserById(Long userId);
}
