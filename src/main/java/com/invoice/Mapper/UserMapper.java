package com.invoice.Mapper;

import com.invoice.Entity.User;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface UserMapper {
    User selectUserByUsername(@RequestBody String username);

    int insertUser(@RequestBody User user);

    List<User> selectAllUser();

    User selectUser(@RequestBody User user);

    User update(@RequestBody User user);

    int delete(@RequestBody int id);

    User selectUserById(@RequestBody int id);

}
