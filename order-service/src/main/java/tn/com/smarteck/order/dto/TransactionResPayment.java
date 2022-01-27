package tn.com.smarteck.order.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResPayment {

	private String paymentStatus;
	private String transactionId;
}