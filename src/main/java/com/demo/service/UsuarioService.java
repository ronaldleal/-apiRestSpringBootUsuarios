package com.demo.service;

import com.demo.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<Usuario> getAllUser();
    Optional<Usuario> getUserForId(long id);
    Usuario saveUser(Usuario usuario);
    boolean deletedUserById(long id);
}
