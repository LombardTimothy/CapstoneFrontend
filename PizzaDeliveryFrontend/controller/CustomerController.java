package za.ac.cput.PizzaDeliveryFrontend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.PizzaDeliveryFrontend.domain.Customer;
import za.ac.cput.PizzaDeliveryFrontend.service.CustomerService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @PostMapping("/create")
    public Customer create(@RequestBody Customer customer){
        return customerService.create(customer);
    }
    @GetMapping("/read/{id}")
    public Customer read(@PathVariable String id){
        return customerService.read(id);
    }

    @PostMapping("update")
    public Customer update(@RequestBody Customer customer){
        return  customerService.update(customer);
    }

    @DeleteMapping("delete/{id}")
    public boolean delete(@PathVariable String id){
        return  customerService.delete(id);
    }

    @GetMapping("/getAll")
    public Set<Customer> getAll(){
        return customerService.getAll();
    }
}
