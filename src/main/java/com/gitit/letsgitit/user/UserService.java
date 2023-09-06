package com.gitit.letsgitit.user;

import com.gitit.letsgitit.user.dto.GetUserReq;

import java.util.List;

public interface UserService {
    User createUser(GetUserReq dto);
    List<User> getAllUsers();
    User getUserById(String id);
    void deleteUserById(String id);
}