package com.invoice.Service;

import com.invoice.Entity.Goods;
import com.invoice.Helper.Exception.CommonException;

import java.util.List;

public interface IGoodsManageService {

    int addGoods(Goods goods) throws CommonException;

    int deleteGoods(int id) throws CommonException;

    Goods updateGoods(Goods goods) throws CommonException;

    Goods getGoodsById(int id);

    Goods getGoods(Goods goods);

    List<Goods> getAllGoods();
}
