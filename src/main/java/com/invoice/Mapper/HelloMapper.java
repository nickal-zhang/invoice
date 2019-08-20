package com.invoice.Mapper;
import com.invoice.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HelloMapper {
    @Select("SELECT * FROM sys_user")
    List<User> findAll();
}
