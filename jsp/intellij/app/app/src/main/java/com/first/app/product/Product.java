package com.first.app.product;

public class Product {

    private String[] list = {"item1", "item2", "item3", "item4"};

    private  int price = 1000;

    // VO 개념 - getter만 만들기
    public String[] getList() {
        return list;
    }

    public int getPrice() {
        return price;
    }
}
