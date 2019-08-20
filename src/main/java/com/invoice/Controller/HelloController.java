package com.invoice.Controller;

import com.invoice.Entity.User;
import com.invoice.Mapper.HelloMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    HelloMapper helloMapper;

    @RequestMapping("/listUser")
    public List<User> listUsers(User user) {
        List<User> users = helloMapper.findAll();
        return users;
    }
}