package br.com.marcoantonio.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstRoute")

public class firstController {

    @GetMapping("/")
    public String firstMessage(){
        return "Done.";
    }


}
