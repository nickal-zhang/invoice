package com.invoice.Service;

import com.invoice.Entity.User;
import com.invoice.Helper.ExceptionType.UserException;

import java.util.List;
public interface IUserControlService {

          int addUser(User user)throws Exception ;
          int deleteUser(int id)throws Exception ;
          User updateUser(User user) throws Exception ;
          User getUserById(int id);
          User getUer(User user);
          List<User> getAllUser() throws UserException;



}
