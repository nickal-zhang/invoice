package com.invoice.Entity;

import java.util.Date;

// 商品信息
public class Goods {
    private Integer id;
    //商品编号
    private String goodsNo;
    //商品名
    private String goodsName;
    //安全存量
    private String safeStock;
    //销售价格
    private Double salePrice;
    //采购价格
    private Double purchasePrice;
    //商品的最近一次进货日期
    private Date lastPurchaseDate;
    //商品的最近一次销售日期
    private Date lastSaleDate;

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

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
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
