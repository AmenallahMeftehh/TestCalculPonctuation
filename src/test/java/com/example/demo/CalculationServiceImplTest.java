package com.example.demo;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculationServiceImplTest {

    @Test
    public void testGetPunctuationsNumber(){
        //given
        String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.";
        List<String> punctuationTable = new ArrayList<String>(Arrays.asList(new String[]{",", ".", ";", ":", "!", "?"}));
        int count = 0 ;
        //when
        for (String car : punctuationTable) {
            count += StringUtils.countMatches(text, car);
        }
        //then
        assertEquals(3, count);
    }

}