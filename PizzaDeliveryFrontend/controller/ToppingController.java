package za.ac.cput.PizzaDeliveryFrontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.PizzaDeliveryFrontend.domain.Topping;
import za.ac.cput.PizzaDeliveryFrontend.service.ToppingService;

import java.util.ArrayList;
/* ToppingController.java
 Author: Timothy Lombard (220154856)
 Date: 17th June (last updated) 2023
*/
@RestController
@RequestMapping("/topping")
public class ToppingController {

    @Autowired
    private ToppingService toppingService;

    @PostMapping("/create")
    public Topping create(@RequestBody Topping topping){
        return toppingService.create(topping);
    }

    @GetMapping("/read/{id}")
    public Topping read(@PathVariable String id){
        return toppingService.read(id);
    }

    @PostMapping("/update")
    public Topping update(@RequestBody Topping topping){
        return toppingService.update(topping);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id){
        return toppingService.delete(id);
    }

    @GetMapping({"/getall"})
    public ArrayList<Topping> getAll(){
        return toppingService.getAll();
    }



}

