package service;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;

// DEV TEST STAGE PROD GOLIVE(END CUSTOMERS)

// GOLIVE -> SUPPORT CENTER -> TICKET ->  DEV/HOT FIXED

// BUGS

// JIRA STORY -> SONAR PLUGIN -> LINTING ERRORS -> TEST CODE COVERAGE

// 1000 LINES OR 100 CLASSES -> 50 -> 50 %, 80 %


// TEST CASES

// EMPLOYEE API -> CREATE A EMPLOYEE

// REQUEST BODY -> DB

// POSTIVE CASES VALID DATA

// INVALID DATA NEGATIVE TEST

// EXCEPTIONS


// DUMMY LOGIC  -> MOCK THAT DUMMY TEST -> WRITE FOR IT

// JUNIT OR MOCKITO

@Service
public class EmployeeService {

    @Autowired private EmployeeRepository employeeRepository;

    public Employee getEmployee(Integer employeeid){
        Employee employee = new Employee(employeeid,"name","user");
        employee.setId(employeeid);

        return employee;
       // return employeeRepository.findById(employee);
    }
}
