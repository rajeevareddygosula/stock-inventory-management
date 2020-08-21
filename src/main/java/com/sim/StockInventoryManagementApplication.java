package com.sim;

import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.sim.enities.QuantityStatus;
import com.sim.enities.Stock;
import com.sim.repo.StockRepository;

@SpringBootApplication
public class StockInventoryManagementApplication {
	public static void main(String[] args) {
		SpringApplication.run(StockInventoryManagementApplication.class, args);
	}
}

@Component
class DemoCommandLineRunner implements CommandLineRunner {
	@Autowired
	private StockRepository stockRepository;

	@SuppressWarnings("deprecation")
	@Override
	public void run(String... args) throws Exception {
		Stock stock1 = new Stock();
		stock1.setNumber(UUID.randomUUID());
		stock1.setName("stock1");
		stock1.setPrice(10);
		stock1.setDate(new Date("2020-08-21"));
		stock1.setQuantity(String.valueOf(QuantityStatus.AVAILABLE));
		stockRepository.save(stock1);
		Stock stock2 = new Stock();
		stock2.setNumber(UUID.randomUUID());
		stock2.setName("stock2");
		stock2.setPrice(20);
		stock2.setDate(new Date("2020-08-21"));
		stock2.setQuantity(String.valueOf(QuantityStatus.AVAILABLE));
		stockRepository.save(stock1);
	}
}
