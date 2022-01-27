package tn.com.smarteck.payment.dto;

import lombok.Data;

@Data
public class TransactionReqOrder {
	
	private int orderId;
	private double amount;

}
