package org.hassan.model;

/**
 * Classe représentant un client
 */
public class Customer {
    private String name;
    private String address;

    /**
     * Constructeur Customer
     * @param name Nom du Client
     * @param address Adresse du Client
     */
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * Récupérer le nom du Client
     * @return <i>String</i> nom du Client
     */
    public String getName() {
        return name;
    }

    /**
     * Assigner un nom au Client
     * @param name nom du Client
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Récupérer l'adresse du Client
     * @return <i>String</i> adresse du Client
     */
    public String getAddress() {
        return address;
    }

    /**
     * Assigner une adresse au CLient
     * @param address Adresse du Client
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Afficher les infos du Client
     * @return <i>String</i> Retourne une chaine de caractères
     * <br> Info : nom + adresse
     */
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
