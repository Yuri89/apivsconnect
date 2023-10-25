package com.senai.apivsconnect.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;
import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tb_usuarios")
public class UsuarioModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario", nullable = false)
    private UUID idUsuario;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "email", nullable = false , unique = true)

    private String email;
    @Column(name = "senha", nullable = false)
    private String senha;
    @Column(name = "endereco")
    private String endereco;
    @Column(name = "cep")
    private String cep;
    @Column(name = "tipo_usuario")
    private String tipoUsuario;
}