package com.pj.projetoIntegrador.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pj.projetoIntegrador.model.usuario;
import com.pj.projetoIntegrador.repository.usuarioRepository;

import jakarta.validation.Valid;

@RestController 
@RequestMapping ("/api/usuarios")
@CrossOrigin (origins = "*")
public class usuarioController {

    private final usuarioRepository repository;

    public usuarioController(usuarioRepository repository){
        this.repository = repository;
    }

    @GetMapping 
    public List<usuario> listar(){
        return repository.findAll();
    }

    @PostMapping 
    @ResponseStatus (HttpStatus.CREATED)
    public usuario criar (@RequestBody @Valid usuario usuario){
        return repository.save(usuario);
    }
    
}
