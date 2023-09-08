package za.ac.cput.PizzaDeliveryFrontend.service.impl;

import org.springframework.stereotype.Service;
import za.ac.cput.PizzaDeliveryFrontend.domain.Address;
import za.ac.cput.PizzaDeliveryFrontend.domain.Pizza;
import za.ac.cput.PizzaDeliveryFrontend.repository.AddressRepository;
import za.ac.cput.PizzaDeliveryFrontend.service.AddressService;

import java.util.Set;
import java.util.stream.Collectors;

/*
AddressServiceImpl.java
Author: Tamryn Lisa Lewin (219211981)
Date: 09 June 2023
Last updated: 10 June 2023
 */

@Service
public class AddressServiceImpl implements AddressService {
    private AddressRepository repository;
    private AddressServiceImpl(AddressRepository repository) {
        this.repository = repository;
    }

    @Override
    public Address create(Address address) {
        return this.repository.save(address);
    }

    @Override
    public Address read(String addressId) {
        return this.repository.findById(addressId).orElse(null);
    }

    @Override
    public Address update(Address address) {
        if (this.repository.existsById(address.getAddressId())) {
            return this.repository.save(address);
        }
        return null;
    }

    @Override
    public Set<Address> getAll() {
        return this.repository.findAll().stream().collect(Collectors.toSet());
        //return (Set<Address>) this.repository.findAll();
    }
}
