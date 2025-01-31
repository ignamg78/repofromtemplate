package com.softtek.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "My first API", description = "Exposes endpoints to interact ...")
public class Controller {

    @Operation(summary = "Greeting", description = "Greetings to everyone")
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
