package jp.co.pise.m_nito.web_example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping
    public String getHello() {

        System.out.println("hello");

        return "hello";
    }

}
