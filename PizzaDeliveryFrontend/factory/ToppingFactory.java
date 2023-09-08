package za.ac.cput.PizzaDeliveryFrontend.factory;

import za.ac.cput.PizzaDeliveryFrontend.domain.Topping;
import za.ac.cput.PizzaDeliveryFrontend.util.Helper;
/* ToppingFactory.java
 Author: Timothy Lombard (220154856)
 Date: 13th June (last updated) 2023
*/
public class ToppingFactory {

    public static Topping buildTopping(String name, String description, int quantity, double price){
        if(Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(description) || Helper.isNullOrEmpty(String.valueOf(quantity)) || Helper.isNullOrEmpty(String.valueOf(price))){
            return null;
        }

        String toppingId = Helper.generateId();

        Topping t = new Topping.Builder().setToppingId(toppingId).setName(name).setDescription(description).setQuantity(quantity).setPrice(price).build();
        return t;
    }
}
