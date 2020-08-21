package com.sim.dto;

public class StockUpdateDTO {
	private String name;
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StockUpdateDTO [name=" + name + ", price=" + price + "]";
	}
}
