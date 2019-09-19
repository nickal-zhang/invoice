package com.invoice.Controller;


import com.invoice.Entity.Operator;
import com.invoice.Service.IOperatorLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/invoice")
public class LoginAction {
    @Autowired
    private IOperatorLoginService operatorLoginService;

    @CrossOrigin(origins = "*")
    @RequestMapping("/login")
    public ModelMap login(@RequestBody Operator operator) {
        ModelMap modelMap = new ModelMap();
        String loginName = operator.getLoginName();
        try {
            Operator  queryOperator = operatorLoginService.queryOperator(loginName);
            boolean verifyResult = operatorLoginService.verifyPassword(operator);
            if (verifyResult) {
                modelMap.addAttribute("result", true);
                modelMap.addAttribute("operator", queryOperator);
            } else {
                modelMap.addAttribute("result", false);
                modelMap.addAttribute("errMsg", "密码错误，请重新输入");
            }
        } catch (Exception e) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", "用户不存在");
            return modelMap;
        }
        return modelMap;
    }
}
