package tn.com.smarteck.order.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.AllArgsConstructor;
import tn.com.smarteck.order.dto.TransactionReqOrder;
import tn.com.smarteck.order.dto.TransactionResPayment;
import tn.com.smarteck.order.entities.Order;
import tn.com.smarteck.order.exceptions.PaimentFailedException;
import tn.com.smarteck.order.repositories.OrderRepository;
import tn.com.smarteck.order.rest.clients.PaimentServiceClient;

@Service
@AllArgsConstructor
public class OrderService {

	private OrderRepository orderRepository;
	private RestTemplate restTemplate;
	//feignClient
	private PaimentServiceClient paimentServiceClient;
	//with Rest Template
	public Order saveOrder(Order order) {
		//do a rest call to payment and pass the order id;
		TransactionResPayment trp = restTemplate
				.postForObject("http://PAIMENT-SERVICE/api/payments/doPayment", 
				new TransactionReqOrder(order.getId(),order.getPrice()*order.getQty()), TransactionResPayment.class);
		if(trp.getPaymentStatus().equals("success")) {
			order.setTransactionId(trp.getTransactionId());
			return orderRepository.save(order);
	}
		else 
			throw new PaimentFailedException("payment failed Order declined");
	}
	
	//with OpenFeign
	public Order saveOrderWithFeign(Order order) {
		//do a rest call to payment and pass the order id;
		TransactionResPayment trp = paimentServiceClient
				.doPayment(new TransactionReqOrder(order.getId(),order.getPrice()*order.getQty()));
		if(trp.getPaymentStatus().equals("success")) {
			order.setTransactionId(trp.getTransactionId());
			return orderRepository.save(order);
	}
		else 
			throw new PaimentFailedException("payment failed Order declined");
	}
}
