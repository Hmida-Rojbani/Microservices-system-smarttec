package tn.com.smarteck.payment.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.com.smarteck.payment.entities.Payment;
import tn.com.smarteck.payment.repositories.PaymentRepository;

@Service
@AllArgsConstructor
public class PaymentService {

	private PaymentRepository paymentRepository;
	
	public Payment doPayment(Payment payment) {
		
		payment.setTransactionId(UUID.randomUUID().toString());
		return paymentRepository.save(payment);
	}
}
