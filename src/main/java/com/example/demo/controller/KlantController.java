package com.example.demo.controller; 

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IKlantService;  
import com.example.demo.model.Klant; 

@RestController
public class KlantController {

	@Autowired
	private IKlantService iKlantService;

	@GetMapping("/api/klant/{id}")
	public Klant findById(@PathVariable Long id) {
		Optional<Klant> optional = this.iKlantService.findOne(id);

		if (optional.isPresent())
			return optional.get();

		return null;
	}

	@GetMapping("/api/klant/all")
	public List<Klant> findAll() {
		return this.iKlantService.findAll();
	}

	@PostMapping("/api/klant")
	public Klant create(@RequestBody Klant klant) {
		return this.iKlantService.create(klant);
	}

	@PutMapping("/api/klant/{id}")
	public boolean update(@PathVariable Long id, @RequestBody Klant klant) {
		this.iKlantService.update(klant);

		return true;
	}

	@DeleteMapping("/api/klant/{id}")
	public boolean delete(@PathVariable Long id) {
		Optional<Klant> optional = this.iKlantService.findOne(id);
		if (optional.isPresent()) {
			this.iKlantService.delete(optional.get());

			return true;
		}

		return false;
	}


	
}