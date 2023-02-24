package com.demo.service;

import com.demo.model.Usuario;
import com.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    public UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> getAllUser() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> getUserForId(long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario saveUser(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public boolean deletedUserById(long id) {
        try{
            Optional<Usuario> optionalUsuario = getUserForId(id);
            usuarioRepository.delete(optionalUsuario.get());
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
}
