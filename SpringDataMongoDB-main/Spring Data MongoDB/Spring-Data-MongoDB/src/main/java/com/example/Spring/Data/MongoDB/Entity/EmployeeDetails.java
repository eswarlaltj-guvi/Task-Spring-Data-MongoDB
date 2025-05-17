package com.example.Spring.Data.MongoDB.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeeDetails
{
    @Id
    private String employeeId;
    private String employeeName;
    private String employeeEmail;
    private String location;
}
