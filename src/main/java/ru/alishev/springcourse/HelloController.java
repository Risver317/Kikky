package ru.alishev.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {

    @GetMapping("/hello-world")
    public String sayHello() {
        String s = "dsds";
        return "hello_world";
    }
}