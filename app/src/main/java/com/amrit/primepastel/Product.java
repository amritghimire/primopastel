package com.amrit.primepastel;

/**
 * Created by RAKEZ on 10/24/2016.
 */
public class Product {
    private String title;
    private String desc;
    private String price;
    private int icon;

    public Product(String title, String desc, String price, int icon) {
        this.title = title;
        this.desc = desc;
        this.price = price;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
