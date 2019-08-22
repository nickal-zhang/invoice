package com.invoice.Controller;


import com.invoice.Entity.User;
import com.invoice.Service.IUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/index")
public class LoginAction {
    @Autowired
    private IUserLoginService userLoginService;

    @RequestMapping("/login")
    public ModelMap login(@RequestBody User user) {
        ModelMap modelMap = new ModelMap();
        String username = user.getUsername();
        User queryUser = userLoginService.queryUser(username);
        if (queryUser == null) {
            modelMap.addAttribute("result", true);
            modelMap.addAttribute("errMsg", "当前用户不存在");
            return modelMap;
        }
        boolean verifyResult = userLoginService.verifyPassword(user);
        if (verifyResult) {
            modelMap.addAttribute("result", true);
            modelMap.addAttribute("user", user);
        } else {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", "您输入的密码有误");
        }
        return modelMap;
    }
}
