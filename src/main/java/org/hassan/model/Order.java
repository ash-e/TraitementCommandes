package org.hassan.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe représentant les commandes
 */
public class Order {

    private Customer customer;
    private List<Product> products;
    private double deliveryFee;

    /**
     * Constructeur Order
     * @param customer Référence d'un client
     * @param products Liste des produits
     * <br> voir classe {@link Customer}
     * <br> voir classe {@link Product}
     */
    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
    }

    /**
     * Constructeur Order
     * @param customer Référence d'un client
     * @param product Référence d'un produit
     * <br> voir classe {@link Customer}
     * <br> voir classe {@link Product}
     */
    public Order(Customer customer, Product product) {
        this.customer = customer;
        this.products = new ArrayList<>();
        this.products.add(product);
    }

    /**
     * Retourner la réf du Client
     * @return <i>Customer</i>
     * <br> voir classe {@link Customer}
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Assigner un client à la commande
     * @param customer Reference à un Client
     * <br> voir classe {@link Customer}
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * Retourner la liste des produits
     * @return <i>{@code List<Product>}</i>
     * <br> voir classe {@link Product}
     */
    public List<Product> getProducts() {
        return products;
    }

    /**
     * Assigner une liste de Produits à la commande
     * @param products
     * <br> voir classe {@link Product}
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * Récupérer les frais de livraison
     * @return <i>double</i> - Retourne les frais de livraison
     */
    public double getDeliveryFee() {
        return deliveryFee;
    }

    /**
     * Définit les frais de livraison
     * @param deliveryFee Assigne les frais de livraison
     */
    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    /**
     * Retourner la somme totale des produits de la commande
     * @return <i>double</i>
     */
    public double getProductsTotalPrice() {
        double total = 0.f;
        for(Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    /**
     * Ajouter un produit
     * @param product Référence à un produit
     * <br> voir classe {@link Product}
     */
    public void addProduct(Product product)
    {
        this.products.add(product);
    }

    /**
     * Affiche les infos de la commande
     * @return <i>String</i>
     * <br> Infos : Client + Produits + Frais + Total
     */
    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", products=" + products +
                ", deliveryFee=" + deliveryFee +
                ", PriceProducts=" + this.getProductsTotalPrice() +
                '}';
    }
}
