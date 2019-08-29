package com.invoice.Controller;

import com.invoice.Entity.User;
import com.invoice.Helper.ExceptionType.UserException;
import com.invoice.Helper.UserConstants;
import com.invoice.Service.IUserControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 用户管理
 */

@RequestMapping("/user")
public class UserAction {
    @Autowired
    private IUserControlService userControlService;

    /**
     * 添加用户
     *
     * @param user
     * @param modelMap
     */
    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public void addUser(User user, ModelMap modelMap) {
        try {
            userControlService.addUser(user);
            modelMap.addAttribute("result", true);
            modelMap.addAttribute("user", user);
        } catch (Exception e) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", UserConstants.FAILURE);
        }
    }

    /**
     * 刪除用户
     * 支持多用户删除
     *
     * @param ids
     * @param modelMap
     */
    @RequestMapping("/delete")
    public void delete(@RequestParam int ids[], ModelMap modelMap) {
        try {
            for (int id : ids) {
                userControlService.deleteUser(id);
            }
            modelMap.addAttribute("result", true);
        } catch (Exception e) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", UserConstants.FAILURE);
        }

    }

    /**
     * 更新用户
     *
     * @param user
     * @param modelMap
     */
    @RequestMapping("/update")
    public void update(User user, ModelMap modelMap) {
        try {
            userControlService.updateUser(user);
            modelMap.addAttribute("result", true);
            modelMap.addAttribute("user", user);
        } catch (Exception e) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", UserConstants.FAILURE);
        }
    }

    /**
     * 取得用户列表
     *
     * @param modelMap
     */
    @RequestMapping("/getAllUser")
    public void list(ModelMap modelMap) {
        try {
            List<User> userList = userControlService.getAllUser();
            modelMap.addAttribute("result", true);
            modelMap.addAttribute("user", userList);
        } catch (UserException e) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", UserConstants.USER_LIST_EMPTY);
        }

    }

}
