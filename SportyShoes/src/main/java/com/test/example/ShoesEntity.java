package com.test.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShoesEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	private int id;
	
	@Column
	private String Shoes;
	
	@Column
	private String ShoesName;
	
	@Column
	private Integer ShoesSize;

	public ShoesEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShoesEntity(int id, String shoes, String shoesName, Integer shoesSize) {
		super();
		this.id = id;
		Shoes = shoes;
		ShoesName = shoesName;
		ShoesSize = shoesSize;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShoes() {
		return Shoes;
	}

	public void setShoes(String shoes) {
		Shoes = shoes;
	}

	public String getShoesName() {
		return ShoesName;
	}

	public void setShoesName(String shoesName) {
		ShoesName = shoesName;
	}

	public Integer getShoesSize() {
		return ShoesSize;
	}

	public void setShoesSize(Integer shoesSize) {
		ShoesSize = shoesSize;
	}
	
	

	
	
	

}