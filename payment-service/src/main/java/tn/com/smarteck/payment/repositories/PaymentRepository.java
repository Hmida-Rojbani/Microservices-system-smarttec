package tn.com.smarteck.payment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tn.com.smarteck.payment.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long>{

}
