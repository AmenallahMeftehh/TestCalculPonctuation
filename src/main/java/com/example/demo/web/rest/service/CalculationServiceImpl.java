package com.example.demo.web.rest.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CalculationServiceImpl implements CalculationService {

    @Override
    public int CalculPonctuation (String text){

        int count = 0;
        StringUtils.countMatches("elephant", "e");
        if ((text == null) || (text.length() == 0)) {
            return 0;
        } else {
            List<String> punctuationTable = new ArrayList<String>(Arrays.asList(new String[]{",", ".", ";", ":", "!", "?"}));
            for (String car : punctuationTable) {
                count += StringUtils.countMatches(text, car);
            }
            return count;
        }
    }

}
