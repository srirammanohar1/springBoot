//package service;
//
//import model.Employee;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.mockito.Mockito.*;
//
//
//@DisplayName("EmployeeService")
//public class EmployeeServiceTest {
//
//    @Mock private EmployeeService employeeService;
//
//
//    @BeforeEach
//    void init(){
//        this.employeeService = new EmployeeService();
//    }
//
//    @Test
//    public void testService(){
//        //dummy object
//        Employee employee = new Employee(1, "test", "test");
//        when(employeeService.getEmployee(1)).thenReturn(employee);
//
//        assertThat(employeeService.getEmployee(1)).isNotNull();
//        assertThat(employeeService.getEmployee(1).getRole()).isEqualTo("test");
//
//        //
//        verify(employeeService.getEmployee(1), times(1) );
//        verify(employeeService.getEmployee(2), never());
//        verify(employeeService.getEmployee(3), atLeast(2));
//
//        Assertions.assertThrows( RuntimeException. class, () -> employeeService.getEmployee(""));
//
//    }
//}
