package cl.duoc.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UsuarioDTO {

    private String username;
    private String password;
    
}
