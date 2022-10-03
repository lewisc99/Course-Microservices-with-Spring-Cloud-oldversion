package com.in28minutes.microservices.currencyconversionservice.controller;


import com.in28minutes.microservices.currencyconversionservice.models.CurrencyConversionBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/currency-converter")
public class CurrencyConversionController {

    @GetMapping("/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable String from,
                                                  @PathVariable String to,
                                                  @PathVariable BigDecimal quantity)
    {
        return new CurrencyConversionBean(from,to,BigDecimal.ONE,quantity,quantity,0);

    }
}
