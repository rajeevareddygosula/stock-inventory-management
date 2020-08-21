package com.sim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sim.dto.StockQueryDTO;
import com.sim.service.StockQueryService;


@RestController
@RequestMapping(value = "/api/stocks")
public class StockQueryController {
	
	@Autowired
	private StockQueryService stockQueryService;
	
	@GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<StockQueryDTO>> listAllStocks(){
        return new ResponseEntity<>(stockQueryService.listAllStocks(), HttpStatus.OK);
    }
}
