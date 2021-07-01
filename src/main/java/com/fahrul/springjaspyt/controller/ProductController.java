package com.fahrul.springjaspyt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fahrul.springjaspyt.entity.Product;
import com.fahrul.springjaspyt.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}

	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> product) {
		return productService.saveProducts(product);
	}

	@GetMapping("/products")
	public List<Product> getAllProduct() {
		return productService.getProducts();
	}

	@GetMapping("/product/{name}")
	public Product findByName(@PathVariable String name) {
		return productService.getProductByName(name);
	}

	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}

	@DeleteMapping("delete/{id}")
	public String deleteProduct(@PathVariable int id) {
		return productService.deleteProduk(id);

	}

}
