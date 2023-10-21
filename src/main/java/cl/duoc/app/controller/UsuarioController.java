package cl.duoc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.app.model.UsuarioDTO;
import cl.duoc.app.model.response.CommonResponseDTO;
import cl.duoc.app.service.UsuarioService;

@RestController
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(path = "/login")
    public CommonResponseDTO login(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioService.login(usuarioDTO);
    }
    
}
