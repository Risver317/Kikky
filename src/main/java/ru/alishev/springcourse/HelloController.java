package ru.alishev.springcourse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {

    @GetMapping("/hello-world")
    public String sayHello() {
        String hello = "Nikita moy pasinok";
        String hello2 = "sss";
        return "hello_world";
    }
}