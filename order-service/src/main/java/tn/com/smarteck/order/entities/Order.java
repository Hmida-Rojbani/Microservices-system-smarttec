package tn.com.smarteck.order.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="ORDER_TB")
public class Order {
	@Id
	private int id;
	private String name;
	private int qty;
	private double price;
	private String transactionId;

}
