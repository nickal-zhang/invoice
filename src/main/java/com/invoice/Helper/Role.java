package com.invoice.Helper;

public enum Role {
    // 超级管理员
    ADMINISTRATOR("0"),

    // 普通用户
    OPERATOR("1");

    private String  permission;
     Role(String permission){
        this.permission =permission;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
