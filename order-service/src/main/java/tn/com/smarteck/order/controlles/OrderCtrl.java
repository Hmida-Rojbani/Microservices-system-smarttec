package tn.com.smarteck.order.controlles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public Order bookOrder(@RequestBody Order order) {
		return orderService.saveOrder(order);
		
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello from Order Service";
	}

}
