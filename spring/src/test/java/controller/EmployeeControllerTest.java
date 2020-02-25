//package controller;
//
//import jdk.net.SocketFlow;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mock;
//import org.springframework.http.HttpMethod;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
//
//import java.net.URI;
//
//@DisplayName("EmployeeController")
//public class EmployeeControllerTest {
//
//    @Mock
//    private EmployeeController mockEmployeController;
//
//    @Mock private MockMvc mockMvc;
//
//    @BeforeEach
//    void init(){
//        this.mockEmployeController = new EmployeeController();
//    }
//
//    @Test
//    public void testEmployeeController(){
//
//        URI uri = URI.create("api/v1/employee");
//
//        URI.create("/api/v1/employee/null");
//
//        // null, empty, object with ovalid
//
//        RequestBuilder requestBuilder = new MockHttpServletRequestBuilder(HttpMethod.GET, uri);
//        mockMvc.perform(requestBuilder).andExpect(SocketFlow.Status.OK).andExpect("{}");
//    }
//
//
//
//
//}
