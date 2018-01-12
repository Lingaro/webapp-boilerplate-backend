package com.example.webappboilerplate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("test")
public class SampleController {
    @GetMapping
    public String test() {
        return "OK";
    }
}
