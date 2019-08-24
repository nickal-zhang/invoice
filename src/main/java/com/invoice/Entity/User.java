package com.invoice.Entity;

public class User {
    private Integer id;
    private String username;
    private String password;
    private int age;
    private String email;

    public User() {
    }

    public User(String username, String password, int age, String email) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.email = email;
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


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("User{");
        sb.append("id=");
        sb.append(id);
        sb.append(",username=");
        sb.append(username);
        sb.append(",age=");
        sb.append(age);
        sb.append(",email=");
        sb.append(email);
        sb.append('}');
        return sb.toString();
    }

}
