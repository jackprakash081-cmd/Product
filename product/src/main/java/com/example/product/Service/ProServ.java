package com.example.product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.product.Entity.Product;
import com.example.product.Repositry.ProRepo;

@Service
public class ProServ {
	
	@Autowired
	ProRepo Repo;
	
	public Product AddPro(Product pro) {	
		return Repo.save(pro);
	}
	public List<Product> getpro() {
		return Repo.findAll();
	}
	public Product getOne(int one) {
		return Repo.getById(one);
	}
	public Product updatePro(Product prod ) {
		return Repo.save( prod);
	}
	public void deletePro(int id) {
	    Repo.deleteById(id);
	}
	

}
