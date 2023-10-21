package cl.duoc.app.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionDTO {
       
   @JsonProperty("buy_order")
   private String buyOrder;
   @JsonProperty("session_id")
   private String sessionId;
   @JsonProperty("amount")
   private int amount;
   @JsonProperty("return_url")
   private String returnUrl;
}
