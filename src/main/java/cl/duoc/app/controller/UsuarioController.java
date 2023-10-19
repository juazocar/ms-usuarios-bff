package cl.duoc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.app.model.UsuarioDTO;
import cl.duoc.app.service.UsuarioService;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping(path = "/login")
    public String login(@RequestBody UsuarioDTO usuarioDTO) {
        return usuarioService.login(usuarioDTO);
    }
    
}
