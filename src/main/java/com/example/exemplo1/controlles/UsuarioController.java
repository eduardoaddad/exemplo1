package com.example.exemplo1.controlles;

import java.util.ArrayList;

import com.example.exemplo1.Models.Usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
    static ArrayList<Usuario> listaUsuario = new ArrayList<>();

    @GetMapping()
    public ArrayList<Usuario> getUsuarios() {
        return listaUsuario;
    }

    @PostMapping()
    public ArrayList<Usuario> postUsuario(@RequestBody Usuario entity) {
        listaUsuario.add(entity);

        return listaUsuario;
    }
}
