package com.in28minutes.microservices.limitsservice.controller;

import com.in28minutes.microservices.limitsservice.models.LimitConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {


    @GetMapping("/limits")
    public LimitConfiguration RetrieveLimitsFromConfiguration()
    {
        return new LimitConfiguration(100,1);
    }

}
