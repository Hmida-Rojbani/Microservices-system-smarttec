package tn.com.smarteck.order.rest.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import tn.com.smarteck.order.dto.TransactionReqOrder;
import tn.com.smarteck.order.dto.TransactionResPayment;


@FeignClient(url = "http://localhost:9191/api/payments", name = "paiment-service")
public interface PaimentServiceClient {
	@PostMapping("/doPayment")
	public TransactionResPayment doPayment(@RequestBody TransactionReqOrder trx);
}
