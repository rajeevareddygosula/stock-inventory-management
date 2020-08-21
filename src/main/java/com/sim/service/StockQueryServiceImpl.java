package com.sim.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sim.dto.StockQueryDTO;
import com.sim.repo.StockRepository;

@Service
public class StockQueryServiceImpl implements StockQueryService {
	@Autowired
	private StockRepository stockRepository;

	@Override
	public List<StockQueryDTO> listAllStocks() {
		List<StockQueryDTO> stockList = new ArrayList<>();
		stockRepository.findAll().forEach(stock -> {
			stockList.add(new StockQueryDTO(stock.getNumber(), stock.getName(), stock.getPrice(), stock.getDate(),
					stock.getQuantity()));
		});
		return stockList;
	}
}
