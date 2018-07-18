package io.haitaoc.controller;


import io.haitaoc.model.JSONResult;
import io.haitaoc.model.User;
import io.haitaoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Hello {
    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    public JSONResult hello(){
        return JSONResult.ok("hello");
    }

    @RequestMapping("/queryUserListPaged/{page}")
    public JSONResult queryUserListPaged(@PathVariable(name = "page") Integer page) {

        if (page == null) {
            page = 1;
        }

        int pageSize = 1;

        User user = new User();
//		user.setNickname("lee");

        List<User> userList = userService.queryUserListPaged(user, page, pageSize);

        return JSONResult.ok(userList);
    }
}
