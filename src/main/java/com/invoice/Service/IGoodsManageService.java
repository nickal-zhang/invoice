package com.invoice.Service;

import com.invoice.Entity.Goods;
import com.invoice.Helper.Exception.CommonException;

import java.util.List;

public interface IGoodsManageService {

    void addGoods(Goods goods) throws CommonException;

    void deleteGoods(Integer id) throws CommonException;

    void updateGoods(Goods goods) throws CommonException;

    Goods getGoodsById(Integer id);

    Goods getGoodsByName(String goodsName);

    Goods getGoods(Goods goods);

    List<Goods> getAllGoods();


}
