package com.sim.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sim.dto.StockCreateDTO;
import com.sim.dto.StockQueryDTO;
import com.sim.dto.StockUpdateDTO;
import com.sim.service.StockCommandService;

@RestController
@RequestMapping(value = "/api/stocks")
public class StockCommandController {
	@Autowired
	private StockCommandService stockCommandService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<UUID> createStock(@RequestBody StockCreateDTO stockCreateDTO) {
		return new ResponseEntity<>(stockCommandService.createStock(stockCreateDTO), HttpStatus.CREATED);
	}

	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<StockQueryDTO> updateStock(@PathVariable(value = "id") UUID id,
			@RequestBody StockUpdateDTO stockUpdateDTO) {
		return new ResponseEntity<>(stockCommandService.updateStock(id, stockUpdateDTO), HttpStatus.OK);
	}
}
