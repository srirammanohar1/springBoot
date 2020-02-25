package controller;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;



    @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public Employee getEmployee(@PathVariable("id") Integer id){
        //EmployeeService es = new EmployeeService();
        Employee employee = employeeService.getEmployee(id);
        return employee;

    }
    @RequestMapping(value = "api/v1/employee/name", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.PUT)
    public String updateEmployee(@RequestHeader String body){
        return "update successful";

    }
    @RequestMapping(value = "api/v1/employee/id", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public String addEmployee(@RequestHeader String body){
        return "added successfully";

    }
    @RequestMapping(value = "api/v1/employee/job", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable("id") Integer id){


    }
    //updateemployeee - put
    //addemployee= post
    //deleteemployee= delete
}
