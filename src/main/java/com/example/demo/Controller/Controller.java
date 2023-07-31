package com.example.demo.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Login;

import com.example.demo.service.LoginService;




@RestController
public class Controller {
	@Autowired(required=true)
	LoginService service;
	@PostMapping("/add")
	
	public Login addDetails(@RequestBody  Login e1)
	{
		return service.saveDetails(e1);
	}
	
	@GetMapping("/showDetails")
	public List<Login> fetchDetails()
	{
		return service.getDetails();
	}
    @PutMapping("/updateDetails")
    public Login updateInfo(@RequestBody Login s1)
    {
    	return service.updateDetails(s1);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteInfo(@PathVariable("id") int id)
    {
    	service.deleteDetails(id);
    	return "Details Deleted Successfully";
    }
}