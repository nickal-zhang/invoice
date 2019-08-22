package com.invoice.Service.Imp;

import com.invoice.Entity.User;
import com.invoice.Mapper.UserMapper;
import com.invoice.Service.IUserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
@Service
public class UserRegisterServiceImp implements IUserRegisterService {
    @Autowired
    private UserMapper userMapper;
    public int registerUser(@RequestBody User user){
       int ret= userMapper.insertUser(user);
       return  ret;
    }


}
