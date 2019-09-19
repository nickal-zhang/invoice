package com.invoice.Entity;


import com.invoice.Helper.Role;

/**
 * 操作员
 **/
public class Operator {
    private Integer id;
    // 员工编号
    private String operatorNo;
    // 登录名
    private String loginName;
    // 登录密码
    private String password;
    // 真实姓名
    private String realName;
    // 电话
    private String tel;
    // 邮箱
    private String email;
    // 家庭住址
    private String address;
    // 角色
    private Role role;

    public Integer getId() {
        return id;
    }

    public String getOperatorNo() {
        return operatorNo;
    }

    public void setOperatorNo(String operatorNo) {
        this.operatorNo = operatorNo;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Operator{");
        sb.append("id=");
        sb.append(id);
        sb.append(",operatorNo=");
        sb.append(operatorNo);
        sb.append(",loginName=");
        sb.append(loginName);
        sb.append(",realName=");
        sb.append(realName);
        sb.append(",tel=");
        sb.append(tel);
        sb.append(",email=");
        sb.append(email);
        sb.append(",address=");
        sb.append(address);
        sb.append(",role=");
        sb.append(role);
        sb.append('}');
        return sb.toString();
    }
}
