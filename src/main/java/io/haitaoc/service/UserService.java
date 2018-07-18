package io.haitaoc.service;

import io.haitaoc.model.User;

import java.util.List;

public interface UserService {
    public User queryUserById(String userId);

    public List<User> queryUserListPaged(User user, Integer page, Integer pageSize);
}
