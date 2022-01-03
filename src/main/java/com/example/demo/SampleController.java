package com.example.demo;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {
    @GetMapping("/sample")
    public String displaySample(@AuthenticationPrincipal UserDetails user) {
        System.out.println(user.toString());

        return "index";
    }
}
