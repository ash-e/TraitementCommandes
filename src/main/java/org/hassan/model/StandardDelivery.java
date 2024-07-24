package org.hassan.model;

/**
 * Stratégie de calcul des frais Standard 5%
 */
public class StandardDelivery implements DeliveryStrategy {

    /**
     * Calcul les frais de livraison Standard
     * @param order Référence à la commande afin de calculer les frais
     * @return <i>double</i> - Frais de livraison Standard
     */
    @Override
    public double calculateDeliveryFee(Order order) {
        return order.getProductsTotalPrice() * 0.05;
    }
}
