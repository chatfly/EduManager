package com.EduManager.infrastructure.presentation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class AlunoController {

    @GetMapping
    public String teste() {
        return "Teste";
    }

}
