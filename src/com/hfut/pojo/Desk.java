package com.hfut.pojo;

public class Desk {
    private int id;
    private double price;

    public Desk() {
    }

    public Desk(int id, double price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Desk{" +
                "id=" + id +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
