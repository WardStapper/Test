package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional; 

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.util.Assert;

import com.example.demo.dao.IKlantDAO;
import com.example.demo.dao.ILoginDAO;
import com.example.demo.model.Klant;
import com.example.demo.model.Login; 

@Service
public class LoginService implements ILoginService{
	
	@Autowired
	private ILoginDAO iLoginDAO; 
	
	@Override
	public Optional <Login> findOne(Long id){
		
		if (id < 0 )
			return Optional.empty();		
		
		return this.iLoginDAO.findById(id); 
	}
	
		
		@Override
		public List<Login> findByUsername (String username){
			
			if (username == null || username.isEmpty())
				return this.iLoginDAO.findAll(); 
			
			return this.iLoginDAO.findByUsername(username); 
		}
	

		@Override
		public void update(Login login) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public void delete(Login login) {
			// TODO Auto-generated method stub
			
		}


		@Override
		public List<Login> findAll() {
			// TODO Auto-generated method stub
			return null;
		}


		@Override
		public Login create(Login login) {
			// TODO Auto-generated method stub
			return null;
		}

	
}