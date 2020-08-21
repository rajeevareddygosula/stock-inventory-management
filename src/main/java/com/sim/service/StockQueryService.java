package com.sim.service;

import java.util.List;

import com.sim.dto.StockQueryDTO;

public interface StockQueryService {
	public List<StockQueryDTO> listAllStocks();
}
