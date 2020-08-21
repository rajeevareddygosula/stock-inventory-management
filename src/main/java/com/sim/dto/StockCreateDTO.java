package com.sim.dto;

import java.util.Date;

public class StockCreateDTO {
	private String name;
	private int price;
	private Date date;

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

	@Override
	public String toString() {
		return "StockCreateDTO [name=" + name + ", price=" + price + ", date=" + date + "]";
	}
}
