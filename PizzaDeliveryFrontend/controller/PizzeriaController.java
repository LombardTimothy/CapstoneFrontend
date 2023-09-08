package za.ac.cput.PizzaDeliveryFrontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.PizzaDeliveryFrontend.domain.Pizzeria;
import za.ac.cput.PizzaDeliveryFrontend.service.PizzeriaService;

import java.util.Set;

@RestController
@RequestMapping("/pizzeria")
public class PizzeriaController {
        @Autowired
        private PizzeriaService pizzeriaService;

        @PostMapping("/create")
        public Pizzeria create(@RequestBody Pizzeria pizzeria) {
            return pizzeriaService.create(pizzeria);
        }
        @GetMapping("/read/{id}")
        public Pizzeria read(@PathVariable String id) {
            return pizzeriaService.read(id);
        }

        @GetMapping("/getAll")
        public Set<Pizzeria> getAll() {
            return pizzeriaService.getAll();
        }
}
