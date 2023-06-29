package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.Target;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/test")
    @ResponseBody
    private String test() {
        return "Hello";
    }
}
