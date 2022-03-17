package com.example.exemplo1.services;

import com.example.exemplo1.Models.Usuario;
import com.example.exemplo1.Repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
public class UsuarioService {

   // Injeção pelo método set
   private UsuarioRepository usuarioRepository;
   @Autowired
public void setRepository(UsuarioRepository usuarioRepository){
    this.usuarioRepository = usuarioRepository;
  }
    


    /* Injeção pelo atributo
    @Autowired
    private UsuarioRepository usuarioRepository;
    */

    /* Injeção pelo contrutor
    private UsuarioRepository usuarioRepository;
       
    @Autowired 
    public UsuarioService(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;
    }
    */


    public void inserir(Object usuario){
        if(validar(usuario)){
           usuarioRepository.inserir(usuario);
           // UsuarioRepository uRepo = new UsuarioRepository();
           // uRepo.inserir(usuario);

        }

    }
    public boolean validar(Object usuario){
        return true;
    }
    
}
