package com.invoice.Mapper;

import com.invoice.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface UserMapper {
    User selectUserByUsername(@Param("username") String username);

    int insertUser(User user);

    List<User> selectAllUser();

    User selectUser(User user);

    User update(User user);

    int delete(int id);

    User selectUserById(int id);

}
