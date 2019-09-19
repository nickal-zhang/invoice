package com.invoice.Mapper;

import com.invoice.Entity.Operator;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface OperatorMapper {

    int insert(Operator Operator);

    List<Operator> selectAllOperator();

    Operator select(Operator Operator);

    int update(Operator Operator);

    int delete(int id);

    Operator selectById(Integer id);

    Operator getOperatorByLoginName(@Param("loginName") String loginName);

    int updateOperatorLoginPassword(@Param("password") String password, @Param("loginName") String loginName);
}
