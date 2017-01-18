package com.niit.shopgorgeous.dao;



import java.util.List;

import com.niit.shopgorgeous.model.Product;



public interface ProductDAO {

	public List<Product> list();

	public Product get(int id);

	public boolean save(Product product);

	public boolean update(Product product);

}
