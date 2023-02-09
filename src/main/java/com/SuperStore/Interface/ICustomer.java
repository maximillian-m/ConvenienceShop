package com.SuperStore.Interface;

import com.SuperStore.Stores.Product;

public interface ICustomer {
    void addToCart(Product product, int quantity);
     void buyProduct();
}
