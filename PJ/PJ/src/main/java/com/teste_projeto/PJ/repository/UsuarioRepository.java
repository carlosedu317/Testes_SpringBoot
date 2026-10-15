package com.teste_projeto.PJ.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.teste_projeto.PJ.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
