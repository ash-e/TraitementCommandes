package org.hassan.controller;

import org.hassan.model.DeliveryStrategy;
import org.hassan.model.Order;


import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui gère les commandes
 */
public class OrderManager {
    List<Order> orders = new ArrayList<>();

    /**
     * Constructeur OrderManager
     * @param orders Liste de commandes
     * <br> voir classe {@link Order}
     */
    public OrderManager(List<Order> orders) {
        for(Order order : orders ) {
            this.getOrders().add(order);
        }
    }

    /**
     * Constructeur OrderManager
     * @param order Référence d'une commande
     * <br> voir classe {@link Order}
     */
    public OrderManager(Order order) {
        this.addOrder(order);
    }

    /**
     * Constructeur OrderManager
     */
    public OrderManager() {}

    /**
     * Ajouter une commande
     * @param order Référence d'une commande
     * <br> voir classe {@link Order}
     */
    public void addOrder(Order order) {
        this.getOrders().add(order);
    }

    /**
     * Ajouter une liste de commandes
     * @param orders Liste de commandes
     * <br> voir classe {@link Order}
     */
    public void addOrder(List<Order> orders) {
        for(Order order : orders ) {
            this.getOrders().add(order);
        }
    }

    /**
     * Retourner une liste de commandes
     * @return <i>{@code List<Order>}</i>
     */
    public List<Order> getOrders() {
        return orders;
    }

    /**
     * Assigner une liste de commandes
     * @param orders Liste de commandes
     * <br> voir classe {@link Order}
     */
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    /**
     * Appliquer une stratégie de frais de commandes
     * @param order Référence d'une commande
     * @param strategy Stratégie de frais de commandes
     * <br> voir classe {@link Order}
     * <br> voir interface {@link DeliveryStrategy}
     */
    public void applyDeliveryStrategy(Order order, DeliveryStrategy strategy) {
        order.setDeliveryFee(strategy.calculateDeliveryFee(order));
    }

    /**
     * Affiche les commandes
     */
    public void printOrders()
    {
        for(Order order : orders) {
            System.out.println(order);
        }
    }
}
