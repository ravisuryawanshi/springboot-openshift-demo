package com.hpa.demo.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot";
    }

    @GetMapping("/cpu-load")
    public String cpuLoad() {
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 60000) { // run for 60 seconds
             double x = Math.sqrt(Math.random() * Math.random());
        }
        return "CPU load completed for 60 seconds";
    }
}