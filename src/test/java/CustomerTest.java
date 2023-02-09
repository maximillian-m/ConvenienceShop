import com.SuperStore.Customer;
import com.SuperStore.Stores.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    private Customer unitTest;
    private Product cart;
    private Product cart1;
    private Product cart2;
    private List<Product> list = new ArrayList<>();

    @BeforeEach
    void setUp() {
        unitTest = new Customer("Frank", 45000.0);
        cart = new Product("bean", 60.0, 2);
        cart1 = new Product("rice", 50.0, 4);
        cart2 = new Product("garri", 30.0, 5);
        list.add(cart);
        list.add(cart1);
        list.add(cart2);
    }

    @Test
    void toCheckTheWallet() {
        double wallet = unitTest.getWallet();
        assertEquals(45000.0, wallet);
    }

    @Test
    void toCheckTheTotalPriceOfProduct() {
        double wallet = unitTest.getWallet();
        assertEquals(45000.0, wallet);

    }

    @Test
    void toCheckQuantityOfProductIsValid() {
        int quantity = 7;
        unitTest.addToCart(cart, quantity);
        boolean check = cart.getQuantity() < quantity;
        assertEquals(false, check);
    }

    @Test
    void toCheckTotalPriceOfGoodsPurchasedByCustomer() {
        double total = 0.0;
        for (Product c : list) {
            total += c.getPrice() * c.getQuantity();
        }
        unitTest.setTotalCashOfProducts(total);
        assertEquals(470, unitTest.getTotalCashOfProducts());

    }
}
