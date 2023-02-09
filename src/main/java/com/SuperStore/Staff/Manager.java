package com.SuperStore.Staff;

import com.SuperStore.Interface.IManager;
import com.SuperStore.Stores.Product;
import com.SuperStore.Stores.*;

public class Manager extends Staff implements IManager {
    private Cashier cashier;
    private Store store;

    private Product product;
    public Manager(String name, Store store) {
        super(name);
        this.store = store;
    }

    @Override
    public void hireCashier(Cashier cashier){
        cashier.setCashier(true);
        System.out.println(cashier.getName() + " is now hired by you");
    }
    @Override
    public void fireCashier(Cashier cashier){
        if(cashier.isCashier()) {
            cashier.setCashier(false);
            System.out.println(cashier.getName() + " your appointment is terminated");
        }else{
            System.out.println("You need to hire a cashier first");
        }
    }
    public void addToStore (Product product){
        store.addToStore(product);
    }
    public void getListOfStockAndPrices(){
        System.out.println(store);
    }
    public double getStoreCash(){
        return store.getStoreCash();
    }

    @Override
    String getStaffId() {
        return null;
    }
}
