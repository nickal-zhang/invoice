package com.invoice.Entity;

import java.util.Date;

// 商品信息
public class Goods {
    private Integer goodsId;
    //商品编号
    private String goodsNo;
    //商品名
    private String goodsName;
    //安全存量
    private String safeStock;
    //销售价格
    private String salePrice;
    //采购价格
    private String purchasePrice;
    //商品的最近一次进货日期
    private Date lastPurchaseDate;
    //商品的最近一次销售日期
    private Date lastSaleDate;

    public Integer getGoodsId() {
        return goodsId;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getSafeStock() {
        return safeStock;
    }

    public void setSafeStock(String safeStock) {
        this.safeStock = safeStock;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getLastPurchaseDate() {
        return lastPurchaseDate;
    }

    public void setLastPurchaseDate(Date lastPurchaseDate) {
        this.lastPurchaseDate = lastPurchaseDate;
    }

    public Date getLastSaleDate() {
        return lastSaleDate;
    }

    public void setLastSaleDate(Date lastSaleDate) {
        this.lastSaleDate = lastSaleDate;
    }
}
