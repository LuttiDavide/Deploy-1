package com.example.demodeploy1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/devName")
    public String getDevName() {
        return "Davide";
    }

}
