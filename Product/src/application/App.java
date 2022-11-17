package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitieEnum.OrderStatus;
import entities.Client;
import entities.Order;
import entities.Orderitem;
import entities.Product;

public class App {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.println("Status: ");

        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order order = new Order(new Date(), status, client);

        System.out.println("How many items to this order?  ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.println(" Enter #" + (i + 1) + "item data");
            System.out.println("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.println(" Product Price: ");
            Double productPrice = sc.nextDouble();
            System.out.println(" quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            Orderitem it = new Orderitem(quantity, productPrice, product);
            order.additem(it);
        }

            System.out.println();
            System.out.println(order);

        sc.close();
    }
}
