package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
class DemoApplicationTests {

    @MockBean
    private ExampleClient exampleClient;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void test() throws Exception {
        when(exampleClient.get()).thenReturn("mock");

        final MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/example")).andDo(print()).andReturn();

        assertThat(mvcResult.getResponse().getContentAsString()).isEqualTo("mock");
    }

}
