/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import java.time.LocalDate;
/**
 *
 * @author sacaro
 */
public class MainParcial2040 {
    //prueba
    

    
    public static void main(String[] args) {
        // Create MarketHub
        MarketHub hub = new MarketHub();

        // Create users (clients and sellers)
        hub.addUser(new Client(200001, "Alice Smith", "alice.smith@example.com", LocalDate.of(2024, 3, 15)));
        hub.addUser(new Seller(100001, "Bob Johnson", "bob.johnson@example.com", LocalDate.of(2024, 5, 20)));
        hub.addUser(new Client(200002, "Charlie Brown", "charlie.brown@example.com", LocalDate.of(2025, 1, 10)));
        hub.addUser(new Client(200003, "Eva Davis", "eva.davis@example.com", LocalDate.of(2024, 9, 5)));
        hub.addUser(new Client(200004, "Grace Lee", "grace.lee@example.com", LocalDate.of(2025, 4, 30)));
        hub.addUser(new Seller(100002, "Frank Miller", "frank.miller@example.com", LocalDate.of(2024, 12, 18)));
        hub.addUser(new Seller(100003, "Henry Taylor", "henry.taylor@example.com", LocalDate.of(2025, 8, 12)));
        hub.addUser(new Client(200005, "Ivy Chen", "ivy.chen@example.com", LocalDate.of(2024, 6, 8)));
        hub.addUser(new Seller(100004, "Jack Anderson", "jack.anderson@example.com", LocalDate.of(2024, 11, 22)));
        hub.addUser(new Client(200006, "Kate Martinez", "kate.martinez@example.com", LocalDate.of(2025, 2, 14)));

        // Create stores (one store per seller)
        hub.createStore("Bob's Store", LocalDate.of(2024, 6, 20), hub.getSeller(100001));
        hub.createStore("Frank's Store", LocalDate.of(2024, 12, 18), hub.getSeller(100002));
        hub.createStore("Henry's Store", LocalDate.of(2025, 8, 12), hub.getSeller(100003));
        hub.createStore("Jack's Store", LocalDate.of(2024, 12, 6), hub.getSeller(100004));

        // Create products
        // Products Bob's Store
        hub.getStore(0).createProduct("Laptop", "High performance laptop", 999.99, "Electronics", 50);
        hub.getStore(0).createProduct("Lamp", "Stylish floor lamp", 59.99, "Home", 65);
        hub.getStore(0).createProduct("Socks", "Comfortable cotton socks", 9.99, "Clothing", 100);
        
        // Products Frank's Store
        hub.getStore(1).createProduct("Headphones", "Noise-cancelling headphones", 199.99, "Electronics", 65);
        hub.getStore(1).createProduct("T-Shirt", "100% cotton t-shirt", 19.99, "Clothing", 50);
        hub.getStore(1).createProduct("Book B", "Interesting book B", 24.99, "Books", 35);
        hub.getStore(1).createProduct("Sneakers", "Stylish sneakers", 69.99, "Clothing", 45);
        hub.getStore(1).createProduct("Book A", "Interesting book A", 29.99, "Books", 40);
        hub.getStore(1).createProduct("Sofa", "Comfortable 3-seater sofa", 499.99, "Home", 35);
        
        // Products Henry's Store
        hub.getStore(2).createProduct("Hat", "Cool baseball cap", 14.99, "Clothing", 40);
        hub.getStore(2).createProduct("Smartphone", "Latest model smartphone", 799.99, "Electronics", 60);
        hub.getStore(2).createProduct("Dining Table", "Wooden dining table", 299.99, "Home", 70);
        hub.getStore(2).createProduct("Book D", "Interesting book D", 14.99, "Books", 50);
        
        // Products Jack's Store
        hub.getStore(3).createProduct("Jacket", "Warm winter jacket", 89.99, "Clothing", 35);
        hub.getStore(3).createProduct("Bed", "Queen size bed", 399.99, "Home", 45);
        hub.getStore(3).createProduct("Jeans", "Comfortable blue jeans", 49.99, "Clothing", 80);
        hub.getStore(3).createProduct("Book C", "Interesting book C", 19.99, "Books", 45);
        hub.getStore(3).createProduct("Chair", "Comfortable dining chair", 89.99, "Home", 55);
    
        // Create client orders
        // Client Alice Smith (200001) orders
        // Order 1
        hub.getClient(200001).makeOrder(202406001, LocalDate.of(2024, 6, 5));
        hub.getClient(200001).addProductToOrder(202406001, hub.getStore(1).getProduct(0), 1);
        hub.getClient(200001).addProductToOrder(202406001, hub.getStore(2).getProduct(1), 1);

        // Order 2
        hub.getClient(200001).makeOrder(202407001, LocalDate.of(2024, 7, 10));
        hub.getClient(200001).addProductToOrder(202407001, hub.getStore(0).getProduct(1), 3);
        hub.getClient(200001).addProductToOrder(202407001, hub.getStore(3).getProduct(0), 2);
        hub.getClient(200001).addProductToOrder(202407001, hub.getStore(1).getProduct(2), 1);
        hub.getClient(200001).addProductToOrder(202407001, hub.getStore(2).getProduct(3), 1);
        hub.getClient(200001).addProductToOrder(202407001, hub.getStore(3).getProduct(3), 1);

        // Order 3
        hub.getClient(200001).makeOrder(202408001, LocalDate.of(2024, 8, 15));
        hub.getClient(200001).addProductToOrder(202408001, hub.getStore(0).getProduct(2), 5);
        hub.getClient(200001).addProductToOrder(202408001, hub.getStore(1).getProduct(1), 4);
        
        // Client Charlie Brown (200002) orders
        // Order 1
        hub.getClient(200002).makeOrder(202406002, LocalDate.of(2024, 6, 20));
        hub.getClient(200002).addProductToOrder(202406002, hub.getStore(1).getProduct(0), 1);
        hub.getClient(200002).addProductToOrder(202406002, hub.getStore(2).getProduct(0), 1);
        hub.getClient(200002).addProductToOrder(202406002, hub.getStore(3).getProduct(1), 1);
        hub.getClient(200002).addProductToOrder(202406002, hub.getStore(0).getProduct(0), 1);

        // Order 2
        hub.getClient(200002).makeOrder(202407002, LocalDate.of(2024, 7, 25));
        hub.getClient(200002).addProductToOrder(202407002, hub.getStore(1).getProduct(3), 2);
        hub.getClient(200002).addProductToOrder(202407002, hub.getStore(2).getProduct(2), 1);

        // Client Eva Davis (200003) orders
        // Order 1
        hub.getClient(200003).makeOrder(202406003, LocalDate.of(2024, 6, 25));
        hub.getClient(200003).addProductToOrder(202406003, hub.getStore(0).getProduct(0), 1);
        hub.getClient(200003).addProductToOrder(202406003, hub.getStore(1).getProduct(0), 1);

        // Order 2
        hub.getClient(200003).makeOrder(202407003, LocalDate.of(2024, 7, 30));
        hub.getClient(200003).addProductToOrder(202407003, hub.getStore(2).getProduct(1), 1);
        hub.getClient(200003).addProductToOrder(202407003, hub.getStore(3).getProduct(0), 1);
        hub.getClient(200003).addProductToOrder(202407003, hub.getStore(0).getProduct(1), 2);
        hub.getClient(200003).addProductToOrder(202407003, hub.getStore(1).getProduct(2), 1);
        hub.getClient(200003).addProductToOrder(202407003, hub.getStore(2).getProduct(3), 1);

        // Order 3
        hub.getClient(200003).makeOrder(202408002, LocalDate.of(2024, 8, 5));
        hub.getClient(200003).addProductToOrder(202408002, hub.getStore(0).getProduct(2), 3);

        // Order 4
        hub.getClient(200003).makeOrder(202409001, LocalDate.of(2024, 9, 10));
        hub.getClient(200003).addProductToOrder(202409001, hub.getStore(1).getProduct(1), 2);
        hub.getClient(200003).addProductToOrder(202409001, hub.getStore(2).getProduct(0), 1);
        hub.getClient(200003).addProductToOrder(202409001, hub.getStore(3).getProduct(1), 1);

        // Client Grace Lee (200004) orders
        // Order 1
        hub.getClient(200004).makeOrder(202406004, LocalDate.of(2024, 6, 30));
        hub.getClient(200004).addProductToOrder(202406004, hub.getStore(0).getProduct(1), 2);
        hub.getClient(200004).addProductToOrder(202406004, hub.getStore(1).getProduct(3), 1);
        hub.getClient(200004).addProductToOrder(202406004, hub.getStore(2).getProduct(2), 1);
        hub.getClient(200004).addProductToOrder(202406004, hub.getStore(3).getProduct(0), 1);
        hub.getClient(200004).addProductToOrder(202406004, hub.getStore(0).getProduct(0), 1);

        // Order 2
        hub.getClient(200004).makeOrder(202407004, LocalDate.of(2024, 7, 15));
        hub.getClient(200004).addProductToOrder(202407004, hub.getStore(1).getProduct(0), 1);

        // Client Ivy Chen (200005) orders
        // Order 1
        hub.getClient(200005).makeOrder(202406005, LocalDate.of(2024, 6, 10));
        hub.getClient(200005).addProductToOrder(202406005, hub.getStore(2).getProduct(1), 1);
        hub.getClient(200005).addProductToOrder(202406005, hub.getStore(3).getProduct(0), 1);

        // Order 2
        hub.getClient(200005).makeOrder(202407005, LocalDate.of(2024, 7, 20));
        hub.getClient(200005).addProductToOrder(202407005, hub.getStore(0).getProduct(2), 4);
        hub.getClient(200005).addProductToOrder(202407005, hub.getStore(1).getProduct(1), 3);
        hub.getClient(200005).addProductToOrder(202407005, hub.getStore(2).getProduct(3), 1);
        hub.getClient(200005).addProductToOrder(202407005, hub.getStore(3).getProduct(3), 2);

        // Order 3
        hub.getClient(200005).makeOrder(202408003, LocalDate.of(2024, 8, 25));
        hub.getClient(200005).addProductToOrder(202408003, hub.getStore(0).getProduct(0), 1);

        // Client Kate Martinez (200006) orders
        // Order 1
        hub.getClient(200006).makeOrder(202406006, LocalDate.of(2024, 6, 15));
        hub.getClient(200006).addProductToOrder(202406006, hub.getStore(1).getProduct(2), 1);

        // Order 2
        hub.getClient(200006).makeOrder(202407006, LocalDate.of(2024, 7, 10));
        hub.getClient(200006).addProductToOrder(202407006, hub.getStore(2).getProduct(0), 1);

        // Order 3
        hub.getClient(200006).makeOrder(202408004, LocalDate.of(2024, 8, 5));
        hub.getClient(200006).addProductToOrder(202408004, hub.getStore(3).getProduct(1), 1);

        // Order 4
        hub.getClient(200006).makeOrder(202409002, LocalDate.of(2024, 9, 15));
        hub.getClient(200006).addProductToOrder(202409002, hub.getStore(0).getProduct(1), 2);

        // Order 5
        hub.getClient(200006).makeOrder(202410001, LocalDate.of(2024, 10, 20));
        hub.getClient(200006).addProductToOrder(202410001, hub.getStore(1).getProduct(4), 1);
        hub.getClient(200006).addProductToOrder(202410001, hub.getStore(2).getProduct(2), 1);
        hub.getClient(200006).addProductToOrder(202410001, hub.getStore(3).getProduct(0), 1);
        hub.getClient(200006).addProductToOrder(202410001, hub.getStore(0).getProduct(0), 1);

        // Change orders status
        // Client Alice Smith (200001) orders
        hub.getClient(200001).confirmOrder(202406001);
        hub.getClient(200001).receiveOrder(202406001);

        hub.getClient(200001).cancelOrder(202407001);
        
        hub.getClient(200001).confirmOrder(202408001);

        // Client Charlie Brown (200002) orders
        hub.getClient(200002).confirmOrder(202406002);
        hub.getClient(200002).receiveOrder(202406002);
        
        hub.getClient(200002).confirmOrder(202407002);
        hub.getClient(200002).cancelOrder(202407002);

        // Client Eva Davis (200003) orders
        hub.getClient(200003).cancelOrder(202406003);

        hub.getClient(200003).confirmOrder(202407003);
        hub.getClient(200003).receiveOrder(202407003);

        hub.getClient(200003).confirmOrder(202408002);

        // Client Grace Lee (200004) orders
        hub.getClient(200004).confirmOrder(202406004);
        hub.getClient(200004).receiveOrder(202406004);

        hub.getClient(200004).cancelOrder(202407004);

        // Client Ivy Chen (200005) orders
        hub.getClient(200005).confirmOrder(202406005);
        hub.getClient(200005).receiveOrder(202406005);

        hub.getClient(200005).confirmOrder(202407005);

        hub.getClient(200005).confirmOrder(202408003);
        hub.getClient(200005).cancelOrder(202408003);

        // Client Kate Martinez (200006) orders
        hub.getClient(200006).cancelOrder(202406006);

        hub.getClient(200006).confirmOrder(202407006);

        hub.getClient(200006).confirmOrder(202408004);
        hub.getClient(200006).receiveOrder(202408004);

        // Execute methods
        hub.storeSummary();
        hub.clientOrderSummary();
        
        Product product = hub.getProductHighestIncome();
        System.out.println("The information of the product with highest income:");
        System.out.println("- Name: " + product.getName());
        System.out.println("- Description: " + product.getDescription());
        System.out.println("- Price: " + String.format("%.2f", product.getPrice()));
        System.out.println("- Category: " + product.getCategory() + "\n");
        
        Client client = hub.getClientMostSpent();
        System.out.println("The client who has spent the most money is " + client.getName() + 
                ", with a total of $" + String.format("%.2f", client.spentSentDelivered()));
    }
    
}

}
