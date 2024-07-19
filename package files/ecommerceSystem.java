import com.ecommerce.Product;
import com.ecommerce.Customer;
import com.ecommerce.orders.Order;
import java.util.Map;
import java.util.Scanner;

public class ecommerceSystem {
    public static void main(String[] args) {
        // New products
        System.out.println("New Stock:");
        Product product1 = new Product(1, "Table", 200.00, "Wooden", 10);
        Product product2 = new Product(2, "Chair", 800.00, "Sofa", 5);
        Product product3 = new Product(3, "Shoes", 150.00, "Leather", 30);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println();

        // New customer
        System.out.println("Customer:");
        Customer customer = new Customer(1, "Becky Li", "becky@gmail.com", "1112233344", "30 Amazing Str");
        System.out.println(customer);
        System.out.println();

        // Customer browses products
        System.out.println("Current Stock:");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
        System.out.println();

        // Customer adds products to the shopping cart
        try {
            customer.addToCart(product1, 1);
            customer.addToCart(product3, 2);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Products Added to Cart:");
        for (Map.Entry<Product, Integer> entry : customer.getShoppingCart().entrySet()) {
            System.out.println(entry.getKey() + " Quantity: " + entry.getValue());
        }

        // Display shopping cart total
        System.out.println("Shopping Cart Total: " + customer.calculateTotal());
        System.out.println();

        // Customer places an order
        System.out.println("Order Summary:");
        customer.placeOrder(1);
        System.out.println();

        // Display updated product stock
        System.out.println("Updated Stock:");
        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);
    }
}
