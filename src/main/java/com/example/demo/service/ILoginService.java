package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Login;

public interface ILoginService {	
	

	public List<Login> findByUsername(String username);

	public Optional<Login> findOne(Long id);	

	public void update(Login login);

	public void delete(Login login);

	public List<Login> findAll();

	public Login create(Login login);

}