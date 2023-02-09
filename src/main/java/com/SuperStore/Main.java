package com.SuperStore;

import com.SuperStore.Staff.Cashier;
import com.SuperStore.Staff.Manager;
import com.SuperStore.Stores.Product;
import com.SuperStore.Stores.Store;

public class Main {
    public static void main(String[] args) {
        //Initialization of a new Store

        Store store1 = new Store ("Kelechi's Store", 100000.0);
        System.out.println("=====================================================");
        System.out.println();
        System.out.println();


        // manager initialization .......
        Manager manager = new Manager("Manager", store1);
        System.out.println(manager.getStoreCash());

        System.out.println("=====================================================");
        System.out.println();
        System.out.println();

        //initialization and addition of products to the store stock
        Product rice = new Product("Rice", 12000.0, 30);
        Product beans = new Product("beans", 30000, 10);
        Product noodles = new Product("noodles", 5000, 50);
        Product drinks = new Product("drinks", 200, 500);
        manager.addToStore(rice);
        manager.addToStore(beans);
        manager.addToStore(noodles);
        manager.addToStore(drinks);
        System.out.println(store1);// Store inventory check of product, prices and quantity
        manager.getListOfStockAndPrices();// manager check of store inventories

        System.out.println("=====================================================");
        System.out.println();
        System.out.println();
        //instantiating a cashier
        Cashier cashier = new Cashier("Calista", store1);

        System.out.println("=====================================================");
        System.out.println();
        System.out.println();
        //Manager hires a cashier for the store
        manager.hireCashier(cashier);

        System.out.println("=====================================================");
        System.out.println();
        System.out.println();

        //instantiating a new customer
        Customer customer1 = new Customer("Customer1", 410000);
        System.out.println(customer1.getWallet());// customer checks wallet

        System.out.println("=====================================================");
        System.out.println();
        System.out.println();

        //customer adds product to customer's cart
        customer1.addToCart(rice, 6);
        customer1.addToCart(noodles, 4);

        System.out.println("=====================================================");
        System.out.println();
        System.out.println();

        // customer checks up the cart and totalPrice of commodity
        System.out.println(customer1.getCart());
        System.out.println(customer1.getTotalCashOfProducts());

        System.out.println("=====================================================");
        System.out.println();
        System.out.println();

        //customer buys product when wallet amount is enough
        customer1.buyProduct();

        System.out.println("=====================================================");
        System.out.println();
        System.out.println();

        //cashier sells product to customer if the customer makes valid purchase and prints receipt
        cashier.sellProducts(customer1);

        System.out.println("=====================================================");
        System.out.println();
        System.out.println();

        //manager gets the store account to check if it's update
        System.out.println(manager.getStoreCash());

        System.out.println("=====================================================");
        System.out.println();
        System.out.println();

        //check store to see reduction in quantity after successful purchase
        System.out.println(store1);


        System.out.println("=====================================================");
        System.out.println();
        System.out.println();

    }
}
