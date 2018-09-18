package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Klant;

public interface IKlantService {

	Optional<Klant> findOne(Long id);
	
	public List <Klant> findAll(); 
	
	public Klant create(Klant klant); 
	
	public void update (Klant klant); 
	
	public void delete (Klant klant); 
	
	
	
	public List <Klant> findByName(String name);

	public List<Klant> findByLastName(String lastName);

	public List<Klant> findByAdress(String adress); 

}
