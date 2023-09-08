package za.ac.cput.PizzaDeliveryFrontend.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.PizzaDeliveryFrontend.domain.Employee;
import za.ac.cput.PizzaDeliveryFrontend.repository.IEmployeeRepository;
import za.ac.cput.PizzaDeliveryFrontend.service.EmployeeService;

import java.util.Set;
import java.util.stream.Collectors;

/* EmployeeServiceImpl.java
 Author: Dawood Kamalie (220147760)
 Date: 11th June (last updated) 2023
*/
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private IEmployeeRepository empRepo;
    @Autowired
    private EmployeeServiceImpl(IEmployeeRepository empRepo){this.empRepo = empRepo;}

    @Override
    public Employee create(Employee employee) {
        return this.empRepo.save(employee);
    }

    @Override
    public Employee read(String empId) {
        return this.empRepo.findById(empId).orElse(null);
    }

    @Override
    public Employee update(Employee employee) {
        if (this.empRepo.existsById(employee.getEmpId())){
            return this.empRepo.save(employee);
        }else {
            return null;
        }
    }

    @Override
    public boolean delete(String empId) {
        if (this.empRepo.existsById(empId)){
            this.empRepo.deleteById(empId);
            return true;
        }
        return false;
    }

    @Override
    public Set<Employee> getAll() {
        return this.empRepo.findAll().stream().collect(Collectors.toSet());
    }


}
