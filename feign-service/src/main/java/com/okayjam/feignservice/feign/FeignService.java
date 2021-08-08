package com.okayjam.feignservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "ser-client")
public interface FeignService {
    @RequestMapping("/hello")
    String hello();
}
