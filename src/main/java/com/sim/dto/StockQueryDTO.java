package com.sim.dto;

import java.util.Date;
import java.util.UUID;

public class StockQueryDTO {
	private UUID number;
	private String name;
	private int price;
	private Date date;
	private String quantity;


	public StockQueryDTO(UUID number, String name, int price, Date date, String quantity) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
		this.date = date;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "StockQueryDTO [number=" + number + ", name=" + name + ", price=" + price + ", date=" + date
				+ ", quantity=" + quantity + "]";
	}

	public UUID getNumber() {
		return number;
	}

	public void setNumber(UUID number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
}
