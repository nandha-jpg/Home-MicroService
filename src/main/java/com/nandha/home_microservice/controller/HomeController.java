package com.nandha.home_microservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String getHome(){
        return "Welcome home!";
    }

    @GetMapping("/products")
    public String getProductDetails(){
        return restTemplate.getForObject("http://PRODUCT-MICROSERVICE/products",String.class);
    }
}
