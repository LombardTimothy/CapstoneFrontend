package za.ac.cput.PizzaDeliveryFrontend.util;
import java.util.UUID;

/*
* Helper.java
* Date: 7/04/2023
* Author: Shared
* */
public class Helper {

    public static boolean isNullOrEmpty(String help){
        if(help == null || help.isEmpty()){
            return true;
        }

        return false;
    }

    public static String generateId(){// to randomly assign an ID
        return UUID.randomUUID().toString();
    } //Randomly assigns an ID
}