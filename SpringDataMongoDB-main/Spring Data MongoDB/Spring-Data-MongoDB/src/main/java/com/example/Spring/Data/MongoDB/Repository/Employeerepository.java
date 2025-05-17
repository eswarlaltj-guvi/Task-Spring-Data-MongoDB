package com.example.Spring.Data.MongoDB.Repository;

import com.example.Spring.Data.MongoDB.Entity.EmployeeDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Employeerepository  extends MongoRepository<EmployeeDetails,String> {
}
