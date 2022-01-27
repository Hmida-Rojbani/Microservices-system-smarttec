package tn.com.smarteck.payment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TransactionResPayment {

	private String paymentStatus;
	private String transactionId;
}
