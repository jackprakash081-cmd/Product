package com.example.product.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.product.Entity.Product;

@Repository
public interface ProRepo extends JpaRepository<Product, Integer>{
	

}
