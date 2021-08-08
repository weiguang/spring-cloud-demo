package com.okayjam.feignservice.controller;

import com.okayjam.feignservice.feign.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    FeignService feignService;
    @GetMapping("test")
    public Object test() {
        return feignService.hello();
    }
}
