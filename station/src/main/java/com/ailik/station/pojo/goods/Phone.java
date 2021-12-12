package com.ailik.station.pojo.goods;

/**
 * @Author mkbk
 * @Description
 * @Create 2021-12-12 13:37
 */
public class Phone {
    private int id;
    private int hot;
    private String model;
    private float price;
    private String series;
    private String brand;
    private String describe;

    public Phone(int id, int hot, String model, float price, String series, String brand, String describe) {
        this.id = id;
        this.hot = hot;
        this.model = model;
        this.price = price;
        this.series = series;
        this.brand = brand;
        this.describe = describe;
    }

    public int getHot() {
        return hot;
    }

    public void setHot(int hot) {
        this.hot = hot;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", hot=" + hot +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", series='" + series + '\'' +
                ", brand='" + brand + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Phone() {
    }

}
