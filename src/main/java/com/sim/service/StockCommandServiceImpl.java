package com.sim.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim.dto.StockCreateDTO;
import com.sim.dto.StockQueryDTO;
import com.sim.dto.StockUpdateDTO;
import com.sim.enities.QuantityStatus;
import com.sim.enities.Stock;
import com.sim.repo.StockRepository;

@Service
public class StockCommandServiceImpl implements StockCommandService {
	@Autowired
	private StockRepository stockRepository;

	@Override
	public UUID createStock(StockCreateDTO stockCreateDTO) {
		Stock newStock = new Stock();
		newStock.setNumber(UUID.randomUUID());
		newStock.setName(stockCreateDTO.getName());
		newStock.setPrice(stockCreateDTO.getPrice());
		newStock.setDate(stockCreateDTO.getDate());
		newStock.setQuantity(String.valueOf(QuantityStatus.AVAILABLE));
		return stockRepository.save(newStock).getNumber();
	}

	@Override
	public StockQueryDTO updateStock(UUID id, StockUpdateDTO stockUpdateDTO) {
		if (stockRepository.findById(id).isPresent()) {
			Stock existingStock = stockRepository.findById(id).get();
			existingStock.setName(stockUpdateDTO.getName());
			existingStock.setPrice(stockUpdateDTO.getPrice());
			Stock updatedStock = stockRepository.save(existingStock);
			return new StockQueryDTO(updatedStock.getNumber(), updatedStock.getName(), updatedStock.getPrice(),
					updatedStock.getDate(), updatedStock.getQuantity());
		} else {
			return null;
		}
	}
}
