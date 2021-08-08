package com.okayjam.servicehi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.Inet4Address;
import java.net.UnknownHostException;
import java.time.LocalDateTime;



@RestController
public class TestController {

    @Autowired
    Environment environment;

    @RequestMapping("hello")
    public Object hello() throws UnknownHostException {
        String str = String.format("Hello from server:%s, port:%s, Date:%s", Inet4Address.getLocalHost().getHostAddress()
                ,environment.getProperty("local.server.port"), LocalDateTime.now());
        return str;
    }
}
