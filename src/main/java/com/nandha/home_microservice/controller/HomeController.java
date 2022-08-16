package com.nandha.home_microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String getHome(){
        return "Welcome home!";
    }

    @GetMapping("/home/products")
    public String getProductDetails(){
        return "products";
    }
}
