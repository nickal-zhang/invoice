package com.invoice.Mapper;

import com.invoice.Entity.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface GoodsMapper {
    Goods selectGoodsByGoodsName(String goodsName);

    int insert(Goods goods);

    List<Goods> selectAllGoods();

    Goods select(Goods goods);

    int update(Goods goods);

    int delete(Integer goodsId);

    Goods selectGoodsById(Integer goodsId);

}
