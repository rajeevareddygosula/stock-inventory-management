package com.sim.service;

import java.util.UUID;

import com.sim.dto.StockCreateDTO;
import com.sim.dto.StockQueryDTO;
import com.sim.dto.StockUpdateDTO;


public interface StockCommandService {
	
	  public UUID createStock(StockCreateDTO stockCreateDTO);
	    public StockQueryDTO updateStock(UUID id, StockUpdateDTO stockUpdateDTO);
}
