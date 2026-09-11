package br.com.fatecfv.siga.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping(value="/")
    public String getHello(){
        return "Olá Mundo";
    }
}
