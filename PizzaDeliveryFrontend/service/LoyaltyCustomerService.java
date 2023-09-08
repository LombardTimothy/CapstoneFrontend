package za.ac.cput.PizzaDeliveryFrontend.service;

import za.ac.cput.PizzaDeliveryFrontend.domain.LoyaltyCustomer;

import java.util.Set;

/*
LoyaltyCustomerService.java
Author: Vuyisa Lutho Mqoboli (219191018)
Date: 09 June 2023
Last updated: 11 June 2023
 */

public interface LoyaltyCustomerService extends za.ac.cput.PizzaDeliveryFrontend.service.IService<LoyaltyCustomer, String> {
    LoyaltyCustomer create(LoyaltyCustomer loyaltyCustomer);

    LoyaltyCustomer read(String customerId);

    LoyaltyCustomer update(LoyaltyCustomer loyaltyCustomer);

    boolean delete(String customerId);

    Set<LoyaltyCustomer> getAll();
}

