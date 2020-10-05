package com.devsuperior.trabalhofinalcap1.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.trabalhofinalcap1.entity.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource{
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "Subaro", "123456789-12", 123., Instant.now(), 18 ));
		list.add(new Client(2L, "Subaro", "123456789-12", 123., Instant.now(), 18 ));
		list.add(new Client(3L, "Subaro", "123456789-12", 123., Instant.now(), 18 ));
		return ResponseEntity.ok().body(list);
		
	}
}
