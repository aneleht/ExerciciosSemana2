package com.senai.exerciciofuturodev.rest.controller;


import com.senai.exerciciofuturodev.domain.service.UsuarioService;
import com.senai.exerciciofuturodev.rest.dto.UsuarioDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/helloworld")
    public String getHelloWorld() {
        return "Hello World";
    }

    @PostMapping("/usuario")
    public String salvarUsuario(@RequestBody UsuarioDto usuarioDto) {
        usuarioService.salvar(usuarioDto);
        return "Usuário cadastrado com sucesso!";
    }

}
