package com.helloworld.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public HelloName hello() {
        return new HelloName("サンタクロース");
    }
}
