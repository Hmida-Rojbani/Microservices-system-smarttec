package tn.com.smarteck.payment.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.com.smarteck.payment.entities.Payment;
import tn.com.smarteck.payment.services.PaymentService;

@RestController
@AllArgsConstructor
public class PaymentController {

	private PaymentService paymentService;
	
	public Payment doPayment(@RequestBody Payment payment) {
		return paymentService.doPayment(payment);
	}
}
