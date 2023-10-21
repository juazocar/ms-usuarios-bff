package cl.duoc.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.app.clients.WebPayAmbFeignClient;
import cl.duoc.app.model.TransactionDTO;
import cl.duoc.app.model.response.CommonResponseDTO;

@Service
public class VentaService {

    @Autowired
    WebPayAmbFeignClient ambFeignClient;

    public CommonResponseDTO initTransaction(){
        TransactionDTO transactionDTO = new TransactionDTO("ordenCompra12345678", "sesion1234557545", 10000, "http://localhost:8100");
        String response = ambFeignClient.initTransaction(transactionDTO);
        return new CommonResponseDTO("200", response);
    }
    
}
