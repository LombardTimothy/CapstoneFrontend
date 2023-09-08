package za.ac.cput.PizzaDeliveryFrontend.factory;

import za.ac.cput.PizzaDeliveryFrontend.domain.Base;
import za.ac.cput.PizzaDeliveryFrontend.domain.Pizza;
import za.ac.cput.PizzaDeliveryFrontend.domain.Pizzeria;
import za.ac.cput.PizzaDeliveryFrontend.util.Helper;


/* PizzaFactory.java
 Author: Timothy Lombard (220154856)
 Date: 21st July (last updated) 2023
*/

    public class PizzaFactory {

        public static Pizza buildPizza(Base baseId, String name, String description, Pizza.Size size, boolean vegetarianOrNot, double price, Pizzeria pizzeria) {
            if (Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(description) || Helper.isNullOrEmpty(String.valueOf(size)) || Helper.isNullOrEmpty(String.valueOf(vegetarianOrNot)) || Helper.isNullOrEmpty(String.valueOf(price)) || Helper.isNullOrEmpty(String.valueOf(pizzeria))) {
                return null;
            }
            String pizzaId = Helper.generateId();

            Pizza pizza = new Pizza.Builder().setPizzaId(pizzaId).setBaseId(baseId).setName(name).setDescription(description).setSize(size).setVegetarianOrNot(vegetarianOrNot).setPrice(price).setPizzeria(pizzeria).build();
            return pizza;

        }


    }

