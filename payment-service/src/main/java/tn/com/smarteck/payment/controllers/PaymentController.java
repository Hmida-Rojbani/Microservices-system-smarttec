package tn.com.smarteck.payment.controllers;

import java.util.Random;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.com.smarteck.payment.dto.TransactionReqOrder;
import tn.com.smarteck.payment.dto.TransactionResPayment;
import tn.com.smarteck.payment.entities.Payment;
import tn.com.smarteck.payment.services.PaymentService;

@RestController
@AllArgsConstructor
@RequestMapping("/api/payments")
public class PaymentController {

	private PaymentService paymentService;
	@PostMapping("/doPayment")
	public TransactionResPayment doPayment(@RequestBody TransactionReqOrder trx) {
		return paymentService.doPayment(trx);
	}
	
}
