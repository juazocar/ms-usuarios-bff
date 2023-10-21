package cl.duoc.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.app.model.response.CommonResponseDTO;
import cl.duoc.app.service.VentaService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class VentasController {
    
@Autowired
VentaService ventaService;

  @PostMapping(value="/transaction")
  public CommonResponseDTO postMethodName() {
      return ventaService.initTransaction();
  }
  

}
