package com.example.receipesharingyoutube.service;

import com.example.receipesharingyoutube.model.User;

public interface UserService {
    public User findUserById(Long userId) throws Exception;

    public User findUserByJwt(String jwt) throws Exception;

}
