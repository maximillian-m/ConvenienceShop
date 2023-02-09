package com.SuperStore.Staff;
import com.SuperStore.Customer;
import com.SuperStore.Interface.ICashier;
import com.SuperStore.Stores.Product;
import com.SuperStore.Stores.Store;
    public class Cashier extends Staff implements ICashier {
        private boolean isCashier;
        private Customer customer;
        private Store store;

        public Cashier(String name, Store store) {
            super(name);
            this.store = store;
        }
        public void setCashier(boolean cashier) {
            isCashier = cashier;
        }
        @Override
        public void sellProducts (Customer customer){
            if(customer.getMadeValidPurchase()){
                double v = store.getStoreCash() + customer.getTotalCashOfProducts();
                store.setStoreCash(v);
                issueReceipt(customer);
            }else{
                System.out.println("Sorry you have not made a valid purchase yet");
            }
        }
        @Override

        public boolean isCashier() {
            return isCashier;
        }

        private void issueReceipt(Customer customer){
            System.out.println("RECEIPT OF PURCHASE");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("Your purchases include: ");
            for(Product item : customer.getCart()){
                System.out.println("item :" + item.getName() + "   QTY:" + item.getQuantity() + "   price:" + item.getPrice());
                System.out.println();
            }
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("Total : NGN" + customer.getTotalCashOfProducts());
        }

        @Override
        String getStaffId() {
            return null;
        }
    }
