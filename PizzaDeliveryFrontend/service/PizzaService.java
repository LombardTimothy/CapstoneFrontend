package za.ac.cput.PizzaDeliveryFrontend.service;

import za.ac.cput.PizzaDeliveryFrontend.domain.Pizza;

import java.util.ArrayList;
import java.util.Set;
/* PizzaService.java
 Author: Timothy Lombard (220154856)
 Date: 4th August (last updated) 2023
*/

public interface PizzaService extends za.ac.cput.PizzaDeliveryFrontend.service.IService<Pizza, String> {

    Pizza create(Pizza pizza);

    Pizza read(String pizzaId);

    Pizza update(Pizza pizza);

    boolean delete(String pizzaId);

    public ArrayList<Pizza> getAll();

}
