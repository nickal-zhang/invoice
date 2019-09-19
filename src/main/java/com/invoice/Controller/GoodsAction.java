package com.invoice.Controller;


import com.invoice.Entity.Goods;
import com.invoice.Helper.Exception.CommonException;
import com.invoice.Service.IGoodsManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品信息管理
 */

@RestController
@RequestMapping(path = "/invoice/goods")
public class GoodsAction {
    @Autowired
    private IGoodsManageService goodsManageService;

    /**
     * 添加商品
     *
     * @param goods
     */
    @RequestMapping(value = "/add", method = {RequestMethod.GET, RequestMethod.POST})
    public ModelMap add(@RequestBody Goods goods) {
        ModelMap modelMap = new ModelMap();
        try {
            goodsManageService.addGoods(goods);
            modelMap.addAttribute("result", true);
        } catch (Exception e) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", "添加失败");
        }
        return modelMap;
    }

    /**
     * 批量刪除商品
     *
     * @param goodsIds
     */
    @RequestMapping("/batchDelete")
    public ModelMap delete(@RequestParam("goodsIds") Integer goodsIds[]) {
        ModelMap modelMap = new ModelMap();
        try {
            for (Integer id : goodsIds) {
                goodsManageService.deleteGoods(id);
            }
            modelMap.addAttribute("result", true);
        } catch (Exception e) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", "批量删除失败");
        }
        return modelMap;
    }

    /**
     * 刪除商品
     *
     * @param goodsId
     */
    @RequestMapping("/delete")
    public ModelMap delete(@RequestParam Integer goodsId) {
        ModelMap modelMap = new ModelMap();
        try {
            goodsManageService.deleteGoods(goodsId);
            modelMap.addAttribute("result", true);
        } catch (CommonException e) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", "删除失败");
        }
        return modelMap;
    }

    /**
     * 更新商品
     *
     * @param goods
     */
    @RequestMapping("/update")
    public ModelMap update(@RequestBody Goods goods) {
        ModelMap modelMap = new ModelMap();
        try {
            goodsManageService.updateGoods(goods);
            modelMap.addAttribute("result", true);
        } catch (Exception e) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", "更新失败");
        }
        return modelMap;
    }

    /**
     * 取得商品列表
     */
    @RequestMapping("/getAllGoods")
    public ModelMap list() {
        ModelMap modelMap = new ModelMap();
        List<Goods> goodsList = goodsManageService.getAllGoods();
        modelMap.addAttribute("result", true);
        modelMap.addAttribute("goodsList", goodsList);
        return modelMap;
    }

    /**
     * 取得商品
     */
    @RequestMapping("/getGoods")
    public ModelMap getGoods(@RequestParam Integer id) {
        ModelMap modelMap = new ModelMap();
        Goods goods = goodsManageService.getGoodsById(id);
        if (goods == null) {
            modelMap.addAttribute("result", false);
            modelMap.addAttribute("errMsg", "获取操作员信息失败");
            return modelMap;
        }
        modelMap.addAttribute("result", true);
        modelMap.addAttribute("Goods", goods);
        return modelMap;
    }

}