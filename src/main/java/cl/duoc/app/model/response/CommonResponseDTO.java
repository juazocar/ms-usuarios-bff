package cl.duoc.app.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommonResponseDTO {
    private String code;
    private String message;
}
