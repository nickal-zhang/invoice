package com.invoice.Service.Imp;

import com.invoice.Entity.User;
import com.invoice.Mapper.UserMapper;
import com.invoice.Service.IUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class UserLoginServiceImp implements IUserLoginService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User queryUser(@RequestBody String username) {
        User user = userMapper.selectUserByUsername(username);
        return user;
    }
    @Override
    public boolean verifyPassword(@RequestBody User user) {
        User queryUser = queryUser(user.getUsername());
        if (user.getPassword().equals(queryUser.getPassword())) {
            return true;
        }
        return false;
    }
}
