package org.hassan.controller;

import org.hassan.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderManagerTest {
    private Customer client1;
    private Customer client2;
    private Product produit1;
    private Product produit2;
    private Product produit3;
    private Product produit4;
    private OrderManager orderManager;

    @BeforeEach
    void setUp() {
        orderManager = new OrderManager();
        client1 = new Customer("Victor", "3 Rue de Besançon");
        client2 = new Customer("Marc-Aurèle", "5 rue Sparte");
        produit1 = new Product("Lenovo m11", 799.99);
        produit2 = new Product("Ipad 10", 598.57);
        produit3 = new Product("RX 7900GRE", 589.00);
        produit4 = new Product("Casque bas de gamme", 10.00);
    }

    @Test
    void testAddOrderList() {
        Order order1 = new Order(client1, Arrays.asList(produit1, produit2));
        Order order2 = new Order(client2, produit3);
        orderManager.addOrder(Arrays.asList(order1, order2));
        assertEquals(2, orderManager.getOrders().size());
    }

    @Test
    void testAddOrder() {
        Order order1 = new Order(client1, produit1);
        orderManager.addOrder(order1);
        assertEquals(1, orderManager.getOrders().size());
    }

    @Test
    void testApplyDeliveryStrategyExpress() {
        Order order = new Order(client1, produit4);
        orderManager.applyDeliveryStrategy(order, new ExpressDelivery());
        assertEquals(1, order.getDeliveryFee());
    }

    @Test
    void testApplyDeliveryStrategyStandard() {
        Order order = new Order(client1, produit4);
        orderManager.applyDeliveryStrategy(order, new StandardDelivery());
        assertEquals(0.5, order.getDeliveryFee());
    }

    @Test
    void testSetOrders()
    {
        Order order1 = new Order(client1, Arrays.asList(produit1, produit2));
        Order order2 = new Order(client2, produit3);
        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        orderManager.setOrders(orderList);
        assertEquals(2, orderManager.getOrders().size());
        /*
        assertEquals("Victor",
                orderManager.getOrders().get(0).getCustomer().getName());
                */
    }

}