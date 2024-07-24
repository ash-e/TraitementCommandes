package org.hassan.model;

/**
 * Classe représentant les produits
 */
public class Product {
    private String name;
    private double price;

    /**
     * Constructeur Product
     * @param name Nom du produit
     * @param price Prix du produit
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Retourner le nom du produit
     * @return <i>String</i>
     */
    public String getName() {
        return name;
    }

    /**
     * Assigner un nom au produit
     * @param name un nom au produit
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retourner le prix d'un produit
     * @return <i>double</i>
     */
    public double getPrice() {
        return price;
    }

    /**
     * Assigner un prix
     * @param price Assigne un prix
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Affiche les infos d'un produit
     * @return <i>String</i> - Retourne une chaine de caractères
     * <br> Infos : Nom + Prix
     */
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
