package com.invoice.Service.Imp;

import com.invoice.Entity.User;
import com.invoice.Helper.ExceptionType.UserException;
import com.invoice.Helper.UserConstants;
import com.invoice.Mapper.UserMapper;
import com.invoice.Service.IUserControlService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserControlServiceImp implements IUserControlService {
    @Autowired
    private UserMapper userMapper;

    public int addUser(User user) throws Exception {
        int ret = userMapper.insertUser(user);
        return ret;

    }

    public int deleteUser(int id) throws Exception {
        return userMapper.delete(id);
    }

    public User updateUser(User user) throws Exception {

        return userMapper.update(user);
    }

    public User getUserById(int id) {
        return userMapper.selectUserById(id);
    }

    public User getUer(User user) {
        return userMapper.selectUser(user);
    }

    public List<User> getAllUser() throws UserException {
        List<User> userList = userMapper.selectAllUser();
        if (userList != null) {
            throw new UserException(UserConstants.USER_LIST_EMPTY);
        }
        return userList;
    }
}