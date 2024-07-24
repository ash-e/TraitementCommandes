package org.hassan.model;

/**
 * Interface pour les calculs de frais
 */
public interface DeliveryStrategy {

    /**
     * Méthode abstraite pour calculer les frais de livraison pour une commande
     * @param order Commande
     * @return <i>double</i>
     */
    double calculateDeliveryFee(Order order);
}
