package za.ac.cput.PizzaDeliveryFrontend.factory;

import za.ac.cput.PizzaDeliveryFrontend.domain.Bill;
import za.ac.cput.PizzaDeliveryFrontend.domain.Order;
import za.ac.cput.PizzaDeliveryFrontend.domain.OrderLine;
import za.ac.cput.PizzaDeliveryFrontend.domain.Pizza;
import za.ac.cput.PizzaDeliveryFrontend.util.Helper;

/*
OrderLineFactory.java
Author: Tamryn Lisa Lewin (219211981)
Date: 04 April 2023
Last update: 08 April 2023
 */

public class OrderLineFactory {
    public static OrderLine buildOrderLine(int quantity, Order order, Pizza pizza, Bill bill) {
        if(Helper.isNullOrEmpty(String.valueOf(quantity)) || Helper.isNullOrEmpty(String.valueOf(order)) || Helper.isNullOrEmpty(String.valueOf(pizza)) || Helper.isNullOrEmpty(String.valueOf(bill))) {
            return null;
        }

        String orderLineId = Helper.generateId();

        OrderLine orderLine = new OrderLine.Builder()
                .setOrderLineId(orderLineId)
                .setQuantity(quantity)
                .setOrder(order)
                .setPizza(pizza)
                .setBill(bill)
                .build();
        return orderLine;
    }
}
