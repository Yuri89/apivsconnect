package com.senai.apivsconnect.repositories;

import com.senai.apivsconnect.models.UsuarioModel;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, UUID> {
}