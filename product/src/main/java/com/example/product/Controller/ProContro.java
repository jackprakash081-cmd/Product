package com.example.product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.Entity.Product;
import com.example.product.Service.ProServ;

@RestController
public class ProContro {
	@Autowired
	ProServ service;
	
	@PostMapping("/create")
	public Product createpro(@RequestBody Product prod) {
		return service.AddPro(prod);
	}
	@GetMapping("/get")
	public List<Product> get() {
		return service.getpro();
	}
	@PutMapping("/update")
	public Product update(@RequestBody Product update) {
		return service.updatePro(update);
	}
	 
	@DeleteMapping("/delete/{ID}")
	public String delete(@PathVariable("ID") int id) {
		service.deletePro(id);
		return  "Delete succesfull";
	}
	

}
