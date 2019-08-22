package com.invoice.Entity;

import com.invoice.helper.Role;

public class User {
    private Integer id;
    private String username;
    private String password;
    private int age;
    private String email;
    private Role role;

    public User(String username, String password, int age, String email, Role role) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.email = email;
        this.role = role;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User{");
        sb.append("{id=");
        sb.append(id);
        sb.append(",username=");
        sb.append(username);
        sb.append(",age=");
        sb.append(age);
        sb.append(",email=");
        sb.append(email);
        sb.append(",role=");
        sb.append(role);
        sb.append('}');
        return sb.toString();
    }
}
