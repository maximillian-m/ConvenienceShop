package com.SuperStore;

import com.SuperStore.Interface.ICustomer;
import com.SuperStore.Staff.Person;
import com.SuperStore.Stores.Product;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person implements ICustomer {
    public double totalCashOfProducts;
    private double wallet;
    private boolean madeValidPurchase = false;


    private List<Product> cart = new ArrayList<>();
    public Customer(String name, double wallet) {
        super(name);
        this.wallet = wallet;
    }
    @Override
    public void addToCart(Product product, int quantity) {
        if (product.getQuantity() < quantity) {
            System.out.println("we do not have sufficient quantity of " + product.getName() + " please reduce quantity");
        } else {
            Product items = new Product(product.getName(), product.getPrice(), quantity);
            product.setQuantity(product.getQuantity() - quantity);
            cart.add(items);
        }
    }

    public double getWallet() {
        return wallet;
    }
    @Override
    public void buyProduct(){
        double v = 0;
        for(Product item : getCart()) {
            v += item.getPrice() * item.getQuantity();
        }
        setTotalCashOfProducts(v);
        exchange();
    }
    public void setTotalCashOfProducts(double totalCashOfProducts) {
        this.totalCashOfProducts = totalCashOfProducts;
    }
    public List<Product> getCart() {
        return cart;
    }
    private void exchange() {
        if (getWallet() < getTotalCashOfProducts()) {
            System.out.println("you have insufficient funds to purchase Items");
            madeValidPurchase = false;
        } else {
            wallet = getWallet() - getTotalCashOfProducts();
            System.out.println("You have successfully made a purchase");
            madeValidPurchase = true;
        }
    }
    public double getTotalCashOfProducts(){
        return totalCashOfProducts;
    }
    public boolean getMadeValidPurchase(){
        return madeValidPurchase;
    }
}
