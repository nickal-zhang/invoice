package com.invoice.Helper.Handler;

import com.invoice.Helper.Role;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RoleHandler extends BaseTypeHandler<Role> {
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, Role role, JdbcType jdbcType) throws SQLException {
        preparedStatement.setString(i,role.getPermission());
    }

    @Override
    public Role getNullableResult(ResultSet resultSet, String s) throws SQLException {
        String val = resultSet.getString(s);
        return getEnum(val);
    }

    @Override
    public Role getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return getEnum(resultSet.getString(i));
    }

    @Override
    public Role getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return getEnum(callableStatement.getNString(i));
    }

    private Role getEnum(String val){
        Class<Role> roleClass = Role.class;
        Role[] roles = roleClass.getEnumConstants();

        for(Role role:roles){
            if(role.getPermission().equals(val)){
                return role;
            }
        }
        return null;
    }
}
