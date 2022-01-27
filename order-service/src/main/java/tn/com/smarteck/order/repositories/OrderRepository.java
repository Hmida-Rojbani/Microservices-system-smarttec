package tn.com.smarteck.order.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.com.smarteck.order.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{

}
