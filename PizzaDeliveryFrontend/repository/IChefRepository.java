package za.ac.cput.PizzaDeliveryFrontend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.PizzaDeliveryFrontend.domain.Chef;

import java.util.Set;

/*
* IChefRepository.java
* Author: Dawood Kamalie  (220147760)
* Date: 8/4/2023
* */
@Repository
public interface IChefRepository extends JpaRepository<Chef, String> {

}
