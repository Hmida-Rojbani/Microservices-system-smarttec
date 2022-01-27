package tn.com.smarteck.order.services;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tn.com.smarteck.order.entities.Order;
import tn.com.smarteck.order.repositories.OrderRepository;

@Service
@AllArgsConstructor
public class OrderService {

	private OrderRepository orderRepository;
	
	public Order saveOrder(Order order) {
		return orderRepository.save(order);
	}
}
