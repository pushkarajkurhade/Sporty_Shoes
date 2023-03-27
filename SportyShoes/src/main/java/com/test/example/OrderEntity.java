package com.test.example;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class OrderEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id", updatable = false, nullable = false)
	private Integer OrderId;
	
	@Column
	private String name;
	
	@Column
	private String Orderid;
	
	@Column
	private String ShoesName;
	
	@Column
	private String size;
	
	@Column
	private String DiliveredAdress;

	public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public OrderEntity(Integer orderId, String name, String orderid2, String shoesName, String size,
			String diliveredAdress) {
		super();
		OrderId = orderId;
		this.name = name;
		Orderid = orderid2;
		ShoesName = shoesName;
		this.size = size;
		DiliveredAdress = diliveredAdress;
	}


	public Integer getOrderId() {
		return OrderId;
	}


	public void setOrderId(Integer orderId) {
		OrderId = orderId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getOrderid() {
		return Orderid;
	}


	public void setOrderid(String orderid) {
		Orderid = orderid;
	}


	public String getShoesName() {
		return ShoesName;
	}


	public void setShoesName(String shoesName) {
		ShoesName = shoesName;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getDiliveredAdress() {
		return DiliveredAdress;
	}


	public void setDiliveredAdress(String diliveredAdress) {
		DiliveredAdress = diliveredAdress;
	}
	
	

}
