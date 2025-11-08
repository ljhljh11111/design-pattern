package com.example.pattern;

/**
 * 具体元素类 - 显示器
 */
public class Monitor implements Element {
    private String brand;
    private String resolution;
    private int price;
    
    public Monitor(String brand, String resolution, int price) {
        this.brand = brand;
        this.resolution = resolution;
        this.price = price;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getResolution() {
        return resolution;
    }
    
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    @Override
    public String toString() {
        return "Monitor{" +
                "brand='" + brand + '\'' +
                ", resolution='" + resolution + '\'' +
                ", price=" + price +
                '}';
    }
}