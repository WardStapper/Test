package com.example.demo.dao;

import com.example.demo.model.Login; 
import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository; 

public interface ILoginDAO extends CrudRepository <Login, Long> {
	
	
@Override
	
public List<Login> findAll(); 

public Optional<Login> findById(Long id);

public List<Login> findByUsername(String username); 


	
	
	
	

}