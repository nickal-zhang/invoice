package com.invoice.Service.Imp;

import com.invoice.Entity.Goods;
import com.invoice.Helper.Exception.CommonException;
import com.invoice.Mapper.GoodsMapper;
import com.invoice.Service.IGoodsManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsManageServiceImp implements IGoodsManageService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public void addGoods(Goods goods) throws CommonException {
        int ret = goodsMapper.insert(goods);
        if (ret != 1) {
            throw new CommonException("insert.error");
        }
    }

    @Override
    public void deleteGoods(Integer id) throws CommonException {
        int ret = goodsMapper.delete(id);
        if (ret == 0) {
            throw new CommonException("delete.error");
        }
    }

    @Override
    public void updateGoods(Goods goods) throws CommonException {
        int ret = goodsMapper.update(goods);
        if (ret != 1) {
            throw new CommonException("update.error");
        }
    }

    @Override
    public Goods getGoodsById(Integer goodsId) {
        return goodsMapper.selectGoodsById(goodsId);
    }

    @Override
    public Goods getGoodsByName(String goodsName) {
        return goodsMapper.selectGoodsByGoodsName(goodsName);
    }

    @Override
    public Goods getGoods(Goods goods) {
        return goodsMapper.select(goods);
    }

    @Override
    public List<Goods> getAllGoods() {
        return goodsMapper.selectAllGoods();
    }
}
