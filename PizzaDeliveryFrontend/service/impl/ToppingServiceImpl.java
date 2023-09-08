package za.ac.cput.PizzaDeliveryFrontend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.PizzaDeliveryFrontend.domain.Topping;
import za.ac.cput.PizzaDeliveryFrontend.repository.IToppingRepository;
import za.ac.cput.PizzaDeliveryFrontend.service.ToppingService;

import java.util.ArrayList;
/* ToppingServiceImpl.java
 Author: Timothy Lombard (220154856)
 Date: 21st July (last updated) 2023
*/
@Service
public class ToppingServiceImpl implements ToppingService {

    private IToppingRepository toppingRepo;
    @Autowired
    private ToppingServiceImpl(IToppingRepository toppingRepo){
        this.toppingRepo = toppingRepo;
    }



    @Override
    public Topping create(Topping topping) {
        return this.toppingRepo.save(topping);
    }

    @Override
    public Topping read(String toppingId) {
        return this.toppingRepo.findById(toppingId).orElse(null);
    }

    @Override
    public Topping update(Topping topping) {
        if(this.toppingRepo.existsById(topping.getToppingId())){
            return this.toppingRepo.save(topping);
        }else{
            return null;
        }

    }

    @Override
    public boolean delete(String toppingId) {
        if(this.toppingRepo.existsById(toppingId)){
            this.toppingRepo.deleteById(toppingId);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Topping> getAll(){return (ArrayList<Topping>) this.toppingRepo.findAll();}
}
