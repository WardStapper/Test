package com.example.demo.dao; 

import com.example.demo.model.Klant;
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository; 




public interface IKlantDAO extends CrudRepository <Klant, Long> {
	

	
public List<Klant> findAll(); 

public List <Klant> findByName (String name);

public Optional<Klant> findById(Long Id);

public Klant save(Klant klant);

public List<Klant> findByLastname(String lastname);

public List<Klant> findByAdres(String adres);
	
	

}