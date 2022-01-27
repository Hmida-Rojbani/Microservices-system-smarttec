package tn.com.smarteck.order.controlles;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tn.com.smarteck.order.entities.Order;
import tn.com.smarteck.order.services.OrderService;

@RestController
@AllArgsConstructor
@RequestMapping("/api/orders")
public class OrderCtrl {
	
	private OrderService orderService;
	
	@PostMapping("/bookOrder")
	public Order bookOrder(Order order) {
		return orderService.saveOrder(order);
	}

}