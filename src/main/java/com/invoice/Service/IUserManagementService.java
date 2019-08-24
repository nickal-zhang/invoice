package com.invoice.Service;

import com.invoice.Entity.User;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
public interface IUserManagementService {

          int addUser(User user);
          int deleteUser(int id);
          int updateUser(User user);
          User getUserById(int id);
          User getUer();
          List<User> getAllUser();



}
