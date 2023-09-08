package za.ac.cput.PizzaDeliveryFrontend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.PizzaDeliveryFrontend.domain.Base;
import za.ac.cput.PizzaDeliveryFrontend.repository.IBaseRepository;
import za.ac.cput.PizzaDeliveryFrontend.service.BaseService;

import java.util.ArrayList;
/* BaseServiceImpl.java
 Author: Timothy Lombard (220154856)
 Date: 21st July (last updated) 2023
*/
@Service
public class BaseServiceImpl implements BaseService {

    private IBaseRepository baseRepo;
    @Autowired
    private BaseServiceImpl(IBaseRepository baseRepo){
        this.baseRepo = baseRepo;
    }



    @Override
    public Base create(Base base) {
        return this.baseRepo.save(base);
    }

    @Override
    public Base read(String id) {
        return this.baseRepo.findById(id).orElse(null);
    }

    @Override
    public Base update(Base base) {
        if(this.baseRepo.existsById(base.getBaseId())){
            return this.baseRepo.save(base);
        }else{
            return null;
        }

    }

    @Override
    public boolean delete(String id) {
        if(this.baseRepo.existsById(id)){
            this.baseRepo.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Base> getAll(){return (ArrayList<Base>) this.baseRepo.findAll();}
}
