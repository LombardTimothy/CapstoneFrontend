package za.ac.cput.PizzaDeliveryFrontend.factory;

import za.ac.cput.PizzaDeliveryFrontend.domain.Chef;
import za.ac.cput.PizzaDeliveryFrontend.domain.Pizzeria;
import za.ac.cput.PizzaDeliveryFrontend.util.Helper;

/*
* ChefFactory.java
* Author: Dawood Kamalie  (220147760)
* Date: 7/4/2023
* */
public class ChefFactory {
    public static Chef createChef(String name, String surname, String phoneNumber, String email, String title, String culinaryExperience, Pizzeria pizzeria) {
        if (  Helper.isNullOrEmpty(title) || Helper.isNullOrEmpty(culinaryExperience)) {
            return null;
        }

        String empId = Helper.generateId();

        Chef chef = (Chef) new Chef.Builder().setTitle(title).setCulinaryExperience(culinaryExperience).setEmpId(empId).setName(name).setSurname(surname).setPhoneNumber(phoneNumber).setEmail(email).setPizzeria(pizzeria).build();
        return chef;



    }
}
