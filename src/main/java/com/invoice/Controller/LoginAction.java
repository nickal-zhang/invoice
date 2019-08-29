package com.invoice.Controller;


import com.invoice.Entity.User;
import com.invoice.Helper.ExceptionType.UserException;
import com.invoice.Helper.UserConstants;
import com.invoice.Service.IUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/index")
public class LoginAction {
    @Autowired
    private IUserLoginService userLoginService;

    @CrossOrigin(origins = "*")
    @RequestMapping("/login")
    public ModelMap login(@RequestBody User user) {
        ModelMap modelMap = new ModelMap();
        String username = user.getUsername();
        try {
            User  queryUser = userLoginService.queryUser(username);
            boolean verifyResult = userLoginService.verifyPassword(user);
            if (verifyResult) {
                modelMap.addAttribute("result", true);
                modelMap.addAttribute("user", user);
            } else {
                modelMap.addAttribute("result", false);
                modelMap.addAttribute("errMsg", UserConstants.USER_PWD_MISMATCH);
            }
        } catch (UserException e) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", UserConstants.USER_NOT_EXISTS);
            return modelMap;
        }
        return modelMap;
    }
}
