package employee.model;

import model.Employee;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;


@DisplayName("EmployeeTest")
public class EmployeeTest {

    // MOCK OBJECTS  -> DUMMY OBJECTS
    // INVVOKE JAVA METHODS U WILL POASS DUMMY DATA
    // THEN COMPARE WITH OUTPUT

    @Mock private Employee mockEmployee;

    @BeforeEach
    void init(){
        this.mockEmployee = new Employee();
    }

    @Test
    public void testEmployeeObject(){
        mockEmployee = new Employee(1,"manohar","CEO");

        assertThat(mockEmployee).isNotNull();
        assertThat(mockEmployee.getId()).isEqualTo(1);
        assertThat(mockEmployee.getName()).isEqualTo("manohar");
        assertThat(mockEmployee.getRole()).isEqualTo("CEO");
    }


}
