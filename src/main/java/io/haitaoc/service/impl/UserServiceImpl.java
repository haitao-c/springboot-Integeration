package io.haitaoc.service.impl;

import com.github.pagehelper.PageHelper;
import io.haitaoc.mapper.UserMapper;
import io.haitaoc.model.User;
import io.haitaoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User queryUserById(String userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    @Override
    public List<User> queryUserListPaged(User user, Integer page, Integer pageSize) {
        // 开始分页
        PageHelper.startPage(page, pageSize);
        List<User> userList = userMapper.selectAll();

        return userList;
    }
}
