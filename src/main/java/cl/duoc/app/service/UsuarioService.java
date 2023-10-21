package cl.duoc.app.service;

import org.springframework.stereotype.Service;

import cl.duoc.app.model.UsuarioDTO;
import cl.duoc.app.model.response.CommonResponseDTO;

@Service
public class UsuarioService {

    public CommonResponseDTO login(UsuarioDTO usuarioDTO){
        CommonResponseDTO commonResponseDTO = null;
        if(usuarioDTO.getUsername().equals("juan@gmail.com") && usuarioDTO.getPassword().equals("1234")){
            commonResponseDTO = new CommonResponseDTO("200", "USUARIO AUTENTICADO");
         } else {
             commonResponseDTO = new CommonResponseDTO("500", "NO EXISTE EL USUARIO");
         }
         return commonResponseDTO;
    }
}
