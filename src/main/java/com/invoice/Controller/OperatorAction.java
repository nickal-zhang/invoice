package com.invoice.Controller;

import com.invoice.Entity.Operator;
import com.invoice.Helper.Exception.CommonException;
import com.invoice.Service.IOperatorManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 操作员管理
 */

@RestController
@RequestMapping(path = "/invoice/operator")
public class OperatorAction {
    @Autowired
    private IOperatorManageService operatorManageService;

    /**
     * 添加操作员
     *
     * @param operator
     */
    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelMap add(@RequestBody Operator operator) {
        ModelMap modelMap = new ModelMap();
        try {
            operatorManageService.addOperator(operator);
            modelMap.addAttribute("result", true);
        } catch (Exception e) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", "添加失败");
        }
        return modelMap;
    }

    /**
     * 批量刪除操作员
     *
     * @param ids
     */
    @RequestMapping("/batchDelete")
    public ModelMap delete(@RequestParam("ids") Integer ids[]) {
        ModelMap modelMap = new ModelMap();
        try {
            for (Integer id : ids) {
                operatorManageService.deleteOperator(id);
            }
            modelMap.addAttribute("result", true);
        } catch (Exception e) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", "批量删除失败");
        }
        return modelMap;
    }

    /**
     * 刪除操作员
     *
     * @param id
     */
    @RequestMapping("/delete")
    public ModelMap delete(@RequestParam Integer id) {
        ModelMap modelMap = new ModelMap();
        try {
            operatorManageService.deleteOperator(id);
            modelMap.addAttribute("result", true);
        } catch (CommonException e) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", "删除失败");
        }
        return modelMap;
    }

    /**
     * 更新操作员,可修改操作员权限
     *
     * @param operator
     */
    @RequestMapping("/update")
    public ModelMap update(@RequestBody Operator operator) {
        ModelMap modelMap = new ModelMap();
        try {
            operatorManageService.updateOperator(operator);
            modelMap.addAttribute("result", true);
        } catch (Exception e) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", "更新失败");
        }
        return modelMap;
    }

    /**
     * 取得操作员列表
     */
    @RequestMapping("/getAllOperator")
    public ModelMap list() {
        ModelMap modelMap = new ModelMap();
        List<Operator> operatorList = operatorManageService.getAllOperator();
        modelMap.addAttribute("result", true);
        modelMap.addAttribute("operatorList", operatorList);
        return modelMap;
    }

    /**
     * 取得操作员
     */
    @RequestMapping("/getOperator")
    public ModelMap getOperator(@RequestParam Integer id) {
        ModelMap modelMap = new ModelMap();
        Operator operator = operatorManageService.getOperatorById(id);
        if (operator == null) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", "获取操作员信息失败");
        }
        modelMap.addAttribute("result", true);
        modelMap.addAttribute("operator", operator);
        return modelMap;
    }

    @RequestMapping("/modifyPassword")
    public ModelMap modifyPassword(@RequestBody Operator operator) {
        String loginName = operator.getLoginName();
        String password = operator.getPassword();
        ModelMap modelMap = new ModelMap();
        Operator ope = operatorManageService.getOperatorByLoginName(loginName);
        String oldPassword = ope.getPassword();
        if (!oldPassword.equals(password)) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", "原密码输入有误");
            return modelMap;
        }
        try {
            operatorManageService.updateOperatorLoginPassword(password, loginName);
            modelMap.addAttribute("result", true);
        } catch (Exception e) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", "密码更新失败，请稍后再试");
        }
        return modelMap;
    }

}
