package com.example.Spring.Data.MongoDB.Service;

import com.example.Spring.Data.MongoDB.Entity.EmployeeDetails;
import com.example.Spring.Data.MongoDB.Repository.Employeerepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeService
{

    private Employeerepository employeerepository;

    public EmployeeDetails saveemployee(EmployeeDetails employeeDetails)
    {
         return  employeerepository.save(employeeDetails);

    }

    public List<EmployeeDetails> getallemployees()
    {
        return employeerepository.findAll();

    }

    public Optional<EmployeeDetails> getuserByid(String employeeId)
    {
        return employeerepository.findById(employeeId);
    }

}
