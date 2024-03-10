package com.example.receipesharingyoutube.repository;

import com.example.receipesharingyoutube.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findAllByEmail(String email);
}
