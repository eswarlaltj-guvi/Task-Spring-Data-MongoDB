package com.example.Spring.Data.MongoDB.Contoller;

import com.example.Spring.Data.MongoDB.Entity.EmployeeDetails;
import com.example.Spring.Data.MongoDB.Service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class EmployeeContoller
{
    private EmployeeService employeeService;

    @GetMapping("/index")
    public String registration(Model model)
    {
        EmployeeDetails employeeDetails=new EmployeeDetails();
        model.addAttribute("employee_registration",employeeDetails);
        return "registration";
    }

    @PostMapping("/registration/save")
    public String res_submit(Model model, @ModelAttribute("employee_registration") EmployeeDetails employeeDetails)
    {
        employeeService.saveemployee(employeeDetails);
        model.addAttribute("employee",employeeDetails);
        return "registration_done";
    }

    @GetMapping("/dispalyall")

    public String getALldata(Model model)
    {
        List<EmployeeDetails> employeeDetails=employeeService.getallemployees();
        model.addAttribute("allemployees",employeeDetails);
        return "allemployees";

    }

    @GetMapping("/dispalyall/{id}")
    public String getUserByid(@PathVariable ("id") String employeeId, Model model)
    {
        Optional<EmployeeDetails> employeeDetails=employeeService.getuserByid(employeeId);

        model.addAttribute("singelEMployeeByid",employeeDetails.orElse(null));

        return "singleEmployee";

    }

}
