package org.example.project_1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("name")
    public String name()
    {
        return "hello Mamatha!";
    }
}
