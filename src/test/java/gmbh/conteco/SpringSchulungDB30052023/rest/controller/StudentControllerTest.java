package gmbh.conteco.SpringSchulungDB30052023.rest.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import gmbh.conteco.SpringSchulungDB30052023.rest.entitiy.Student;
import gmbh.conteco.SpringSchulungDB30052023.rest.service.StudentService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(StudentController.class)
class StudentControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    StudentService studentService;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void saveStudentFromJson() throws Exception {
        Student student = new Student(1L, "Michael");
        Mockito.when(studentService.saveStudent(student))
                .thenReturn(student);

        MockHttpServletRequestBuilder postRequest =
                MockMvcRequestBuilders.post("/students/new")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(student));

        mockMvc.perform(postRequest)
                .andExpect(status().isCreated());
                //.andExpect(jsonPath("$.id").value(1))
                //.andExpect(jsonPath("$.name").value("Michael"));
    }
}