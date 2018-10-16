package com.example.dubbo.server.server.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.dubbo.server.server.UserServer;
import com.example.dubbo.server.vo.User;

/**
 * @author yushengma
 */
@Service(version = "1.0.0")
@org.springframework.stereotype.Service
public class UserServerImpl implements UserServer {
    @Override
    public User getUserByName(String userName) {
        return new User(userName, 18, "man");
    }
}
