package org.hassan.view;

import org.hassan.controller.OrderManager;
import org.hassan.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Customer client1 = new Customer("Medvedev", "5 rue Roland Garros");
        Customer client2 = new Customer("J.R.R", "5 rue Tolkien");

        Product produit1 = new Product("Lenovo", 799.99);
        Product produit2 = new Product("Ipad", 578.59);
        Product produit3 = new Product("Smartphone", 456.5);

        Order order1 = new Order(client1, Arrays.asList(produit1, produit2));
        Order order2 = new Order(client2, Arrays.asList(produit1, produit2, produit3));

        OrderManager test = new OrderManager(order1);

        test.applyDeliveryStrategy(order1, new StandardDelivery());
        test.addOrder(order2);
        test.applyDeliveryStrategy(order2, new ExpressDelivery());
        test.printOrders();

    }
}