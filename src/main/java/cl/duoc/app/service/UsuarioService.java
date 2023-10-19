package cl.duoc.app.service;

import org.springframework.stereotype.Service;

import cl.duoc.app.model.UsuarioDTO;

@Service
public class UsuarioService {

    public String login(UsuarioDTO usuarioDTO){
        if(usuarioDTO.getUsername().equals("juan@gmail.com") && usuarioDTO.getPassword().equals("1234")){
            return "USUARIO AUTENTICADO";
         } else {
            return "NO EXISTE EL USUARIO";
         }
    }
    
}
