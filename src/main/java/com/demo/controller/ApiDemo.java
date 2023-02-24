package com.demo.controller;

import com.demo.model.Usuario;
import com.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")

public class ApiDemo {
    @Autowired
    UsuarioService usuarioService;


    @GetMapping("/saludar")
    public String saludar() {
        return "Hola mundo";
    }

    @GetMapping("/all")
    public List<Usuario> getAllUser() {
        return usuarioService.getAllUser();
    }

    @GetMapping("/find/{id}")
    public Optional<Usuario> getUserById(@PathVariable long id) {
        return usuarioService.getUserForId(id);
    }

    @PostMapping("/save")
    public Usuario saveUser(@RequestBody Usuario usuario) {
        return usuarioService.saveUser(usuario);
    }

    @DeleteMapping("/deleted/{id}")
    public String deletedUser(@PathVariable("id") long id) {
        if (usuarioService.deletedUserById(id))
            return "Se a eliminado usuario";
        else
            return "No se ha eliminado el usuario, no existe";
    }

}
