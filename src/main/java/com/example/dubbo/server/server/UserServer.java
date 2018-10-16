package com.example.dubbo.server.server;

import com.example.dubbo.server.vo.User;

/**
 * @author yushengma
 */
public interface UserServer {
    User getUserByName(String userName);
}
