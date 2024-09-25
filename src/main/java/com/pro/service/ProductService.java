package com.pro.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.pro.exception.ProductException;
import com.pro.model.Product;
import com.pro.request.CreateProductRequest;

public interface ProductService {
	
	public Product createProduct(CreateProductRequest req);

	public String deleteProduct(Long productId) throws ProductException;
	
	public Product updateProduct(Long productId, Product product) throws ProductException;

	public Product findProductById(Long id) throws ProductException;
	
	public List<Product> findPoductByCategory(String category);
	
	public List<Product>getAllProduct();

	public List<Product> searchProduct(String query);
	
//	public List<Product> getAllProduct(List<String>colors,List<String>sizes,int minPrice, int maxPrice,int minDiscount, String category, String sort,int pageNumber, int pageSize);
	public Page<Product> getAllProduct(String category, List<String>colors, List<String> sizes, Integer minPrice, Integer maxPrice, Integer minDiscount,String sort, String stock, Integer pageNumber, Integer pageSize);
	
	public List<Product> recentlyAddedProduct();
	
}
