package com.example.demo.web.rest.controller;

import com.example.demo.web.rest.service.CalculationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CalculController {

    private final Logger log = LoggerFactory.getLogger(CalculController.class);

    @Autowired
    public CalculationService calculationService;

    /**
     * POST  /getNumberOfPunctuation : update the current user information.
     *
     * @param punctuationTextVM the text ...
     */
    @RequestMapping(value = "/getNumberOfPunctuation", method = RequestMethod.POST)
    public ResponseEntity<?> getNumberOfPunctuation(@RequestBody String punctuationTextVM) {
        int count = calculationService.CalculPonctuation(punctuationTextVM);
        return new ResponseEntity<>(String.valueOf(count), HttpStatus.OK);
    }

}
