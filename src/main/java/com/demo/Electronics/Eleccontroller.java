package com.demo.Electronics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

@RestController
public class Eleccontroller {
	
	@Autowired
	private Electronicservice electronicservice;
	
	@PostMapping("/add")
	public ResponseEntity<?> insert(@RequestBody Electronicitem electronicitem){
		return new ResponseEntity<Electronicitem>(electronicservice.Add(electronicitem), HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{id}")
	public Electronicitem getproduct(@PathVariable Integer id) {
		return electronicservice.getproduct(id);
	}
	
	@PutMapping("/update")
	public Electronicitem updateproduct(@RequestBody Electronicitem electronicitem) {
		return electronicservice.updateproduct(electronicitem);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteproduct(@PathVariable int id) {
		return electronicservice.delete(id);
	}
	
	@GetMapping("/Allproduct")
	public List<Electronicitem> getAllproduct(){
		
		return electronicservice.getAllproduct();
	}
	
	
	
	
	
	

}
