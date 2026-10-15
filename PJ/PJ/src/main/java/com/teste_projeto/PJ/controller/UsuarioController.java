package com.teste_projeto.PJ.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.teste_projeto.PJ.model.Usuario;
import com.teste_projeto.PJ.repository.UsuarioRepository;

import jakarta.validation.Valid;

@RestController 
@RequestMapping ("/api/usuarios")
@CrossOrigin (origins = "*")
public class UsuarioController {

    private final UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository){
        this.repository = repository;
    }

    @GetMapping 
    public List<Usuario> listar(){
        return repository.findAll();
    }

    @PostMapping 
    @ResponseStatus (HttpStatus.CREATED)
    public Usuario criar (@RequestBody @Valid Usuario usuario){
        return repository.save(usuario);
    }
    
}
