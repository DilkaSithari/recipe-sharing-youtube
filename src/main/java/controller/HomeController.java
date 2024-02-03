package controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
    @GetMapping
    public String homeController(){
        return "Hiiii";
    }

}
