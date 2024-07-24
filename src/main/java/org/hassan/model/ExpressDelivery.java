package org.hassan.model;

/**
 * Stratégie de calcul des frais Express 10%
 */
public class ExpressDelivery implements DeliveryStrategy {

    /**
     * Calcul les frais de livraison Express
     * @param order Référence à la commande afin de calculer les frais
     * @return <i>double</i> - Frais de livraison Express
     */
    @Override
    public double calculateDeliveryFee(Order order) {
        return order.getProductsTotalPrice() * 0.10;
    }
}
