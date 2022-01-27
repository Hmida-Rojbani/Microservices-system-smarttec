package tn.com.smarteck.payment.services;

import java.util.Random;
import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.com.smarteck.payment.dto.TransactionReqOrder;
import tn.com.smarteck.payment.dto.TransactionResPayment;
import tn.com.smarteck.payment.entities.Payment;
import tn.com.smarteck.payment.repositories.PaymentRepository;

@Service
@AllArgsConstructor
public class PaymentService {

	private PaymentRepository paymentRepository;
	
	public TransactionResPayment doPayment(TransactionReqOrder trx) {
		Payment payment = new Payment();
		payment.setOrderId(trx.getOrderId());
		payment.setAmount(trx.getAmount());
		payment.setPaymentStatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
		paymentRepository.save(payment);
		return new TransactionResPayment(payment.getPaymentStatus(), payment.getTransactionId());
	}
	
	//simulation for 3rd party payment app
		public String paymentProcessing() {
			return new Random().nextBoolean()?"success":"failed";
		}
}
