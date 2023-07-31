package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Login;
import com.example.demo.repository.LoginRepo;






@Service
public class LoginService {
	
	@Autowired
	LoginRepo erepo;
	
	public Login saveDetails(Login e)
	{
		
	return erepo.save(e);
	}
    public List<Login> getDetails()
    {
    	return erepo.findAll();
    }
    public Login updateDetails(Login s)
    {
    	return erepo.saveAndFlush(s);
    }
    public void deleteDetails(int id)
    {
    	erepo.deleteById(id);
    }
}