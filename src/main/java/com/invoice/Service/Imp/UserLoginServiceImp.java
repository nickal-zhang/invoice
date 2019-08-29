package com.invoice.Service.Imp;

import com.invoice.Entity.User;
import com.invoice.Helper.ExceptionType.UserException;
import com.invoice.Helper.UserConstants;
import com.invoice.Mapper.UserMapper;
import com.invoice.Service.IUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserLoginServiceImp implements IUserLoginService {

    @Autowired
    private UserMapper userMapper;


    public User queryUser (String username) throws UserException {
        User user = userMapper.selectUserByUsername(username);
        if(user==null){
            throw  new UserException(UserConstants.USER_NOT_EXISTS);
        }
        return user;
    }


    public boolean verifyPassword (User user) throws UserException {
        User queryUser = queryUser(user.getUsername());
        if (user.getPassword().equals(queryUser.getPassword())) {
            user.setAge(queryUser.getAge());
            user.setId(queryUser.getId());
            user.setEmail(queryUser.getEmail());
            return true;
        }
        return false;
    }
}
