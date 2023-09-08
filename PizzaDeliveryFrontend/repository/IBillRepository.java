package za.ac.cput.PizzaDeliveryFrontend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.PizzaDeliveryFrontend.domain.Bill;

import java.util.Set;
/*
IBillRepository.java
Author: Vuyisa Lutho Mqoboli (219191018)
Date: 01 August 2023
Last update: 08 August 2023
 */

@Repository
public interface IBillRepository extends JpaRepository<Bill, String> {

}

