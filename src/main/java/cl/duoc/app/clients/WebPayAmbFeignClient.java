package cl.duoc.app.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import cl.duoc.app.model.TransactionDTO;

@FeignClient(name = "ms-webpay-amb-svc", url = "http://localhost:8181")
public interface WebPayAmbFeignClient {
    
    @PostMapping(path = "/transaction")
    public String initTransaction(@RequestBody TransactionDTO transactionDTO);
}
