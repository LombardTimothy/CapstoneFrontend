package za.ac.cput.PizzaDeliveryFrontend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.PizzaDeliveryFrontend.domain.LoyaltyCustomer;
import za.ac.cput.PizzaDeliveryFrontend.repository.ILoyaltyCustomerRepository;
import za.ac.cput.PizzaDeliveryFrontend.service.LoyaltyCustomerService;
import java.util.Set;
import java.util.stream.Collectors;

/*
LoyaltyCustomerServiceImpl.java
Author: Vuyisa Lutho Mqoboli (219191018)
Date: 09 June 2023
Last updated: 11 June 2023
 */

@Service
public class LoyaltyCustomerServiceImpl implements LoyaltyCustomerService {
    private ILoyaltyCustomerRepository repository;

    @Autowired
    private LoyaltyCustomerServiceImpl(ILoyaltyCustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public LoyaltyCustomer create(LoyaltyCustomer loyaltyCustomer) {
        return this.repository.save(loyaltyCustomer);
    }

    @Override
    public LoyaltyCustomer read(String customerId) {
        return this.repository.findById(customerId).orElse(null);
    }

    @Override
    public LoyaltyCustomer update(LoyaltyCustomer loyaltyCustomer) {
        if (this.repository.existsById(loyaltyCustomer.getCustomerID())) {
            return this.repository.save(loyaltyCustomer);
        }
        return null;
    }

    @Override
    public boolean delete(String customerId) {
        if (this.repository.existsById(customerId)) {
            this.repository.deleteById(customerId);
            return true;
        }
        return false;
    }

    @Override
    public Set<LoyaltyCustomer> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
    }
}

