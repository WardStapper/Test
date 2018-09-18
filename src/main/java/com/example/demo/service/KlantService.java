package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional; 

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.util.Assert; 

import com.example.demo.dao.IKlantDAO;
import com.example.demo.model.Klant; 


@Service
public class KlantService implements IKlantService {
	
	@Autowired
	private IKlantDAO iKlantDAO; 
	
	@Override
	public Optional <Klant> findOne(Long id){
		
		if (id < 0 )
	return Optional.empty();
		
		return this.iKlantDAO.findById(id); }
	
		
		@Override
		public List <Klant> findByName (String name){
			
			if (name == null || name.isEmpty())
				return this.iKlantDAO.findAll(); 
			
			return this.iKlantDAO.findByName(name); 
		}
		
		@Override
		public List <Klant> findByLastName(String lastname){
			
			if (lastname == null || lastname.isEmpty())
			return this.iKlantDAO.findAll(); 
			
			return this.iKlantDAO.findByLastname(lastname); 
			
			
		}
		
	
		@Override
		public List<Klant> findByAdress(String adress) {
			
			if (adress == null || adress.isEmpty())
				return this.iKlantDAO.findAll(); 
			
			return this.iKlantDAO.findByName(adress); 
			
		}
		
	@Override
	public List<Klant> findAll() {
	
		return this.iKlantDAO.findAll(); 
	}

	
	@Override
	 
	public Klant create (Klant klant) {
		Assert.notNull(klant, "Klant kan geen null zijn!");
		
		return this.iKlantDAO.save(klant); 
		
	}
		



	@Override
	public void update(Klant klant) {
	Assert.notNull(klant, "Klant kan geen null zijn!");
	
	this.iKlantDAO.save(klant); 
		
	}


	@Override
	public void delete(Klant klant) {
		// TODO Auto-generated method stub
		
	}
}