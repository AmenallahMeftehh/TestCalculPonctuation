package com.example.demo;
import com.example.demo.web.rest.Controller.CalculController;
import com.example.demo.web.rest.service.CalculationService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

    @RunWith(MockitoJUnitRunner.class)
    public class CalculationControllerTest {
        @Mock
        CalculationService calculationServiceMock;

        @InjectMocks
        CalculController calculController;

        private MockMvc mockMvc;

        @Before
        public void setup() {
            this.mockMvc = MockMvcBuilders.standaloneSetup(calculController)
                    .build();
        }
        @Test
        public void testGetPunctuationNumber() throws Exception {

            //given
            String text = "Test to do , . ;";

            // when
            when(calculationServiceMock.CalculPonctuation(any())).thenReturn(3);

            // then
            mockMvc.perform(post("/api/getNumberOfPunctuation").content(
                    text))
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$.value", is(3)));

            verify(calculationServiceMock, times(1)).CalculPonctuation(any());
            verifyNoMoreInteractions(calculationServiceMock);

        }


    }


