package com.invoice.Controller;

import com.invoice.Entity.User;
import com.invoice.Service.IUserRegisterService;
import com.invoice.helper.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/register")
public class RegisterAction {
    @Autowired
    private IUserRegisterService userRegisterService;

    @RequestMapping("/registerUser")
    public ModelMap register(@RequestBody User user) {
        String username = user.getUsername();
        String password = user.getPassword();
        int age = user.getAge();
        String email = user.getEmail();
        User newUser = new User(username, password, age, email, Role.USER);
        int ret = userRegisterService.registerUser(newUser);
        ModelMap modelMap = new ModelMap();
        if (ret > 0) {
            modelMap.addAttribute("result", true);
            modelMap.addAttribute("user", newUser);
        } else {
            modelMap.addAttribute("result", false);
        }
        return modelMap;
    }
}
