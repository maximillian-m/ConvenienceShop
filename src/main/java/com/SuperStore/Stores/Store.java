package com.SuperStore.Stores;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private double storeCash;
    private List<Product> stocks;
    private Product product;

    public Store(String name, double cash) {
        storeCash = cash;
        this.stocks = new ArrayList<>();
        System.out.println(name + " has been initialized and has an account of NGN"+ storeCash);
    }

    public double getStoreCash() {
        return storeCash;
    }

    public void setStoreCash(double cash) {
        this.storeCash = cash;
    }
    public void addToStore (Product product){
        stocks.add(product);
        System.out.println("You added "+ product.getName() + " to your list of stocks");
    }
    public List<Product> getStocks() {
        return stocks;
    }
    @Override
    public String toString() {
        return "Store{" +
                "stocks=" + stocks +
                '}';
    }
}
