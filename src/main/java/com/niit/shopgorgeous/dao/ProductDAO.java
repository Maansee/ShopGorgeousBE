package com.niit.shopgorgeous.dao;



import java.util.List;

import com.niit.shopgorgeous.model.Category;
import com.niit.shopgorgeous.model.Product;
import com.niit.shopgorgeous.model.Supplier;



public interface ProductDAO {

	public void save(Product product);

	public void update(Product product);

	public void delete(int id);

	public Product get(int productid);

	public List<Product> list();
	
	public List<Category>listcatgname();
	
	public List<Supplier>listsuplname();
}


