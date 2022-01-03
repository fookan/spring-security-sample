package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

public class SampleController {
    @GetMapping("/sample")
    public String displaySample() {
        return "index";
    }
}
