package com.pj.projetoIntegrador.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pj.projetoIntegrador.model.usuario;

public interface usuarioRepository extends JpaRepository<usuario, Long> {
    
}
