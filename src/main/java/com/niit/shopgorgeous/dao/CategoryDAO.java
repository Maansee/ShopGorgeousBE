package com.niit.shopgorgeous.dao;

import java.util.List;

import com.niit.shopgorgeous.model.Category;

public interface CategoryDAO {

	public List<Category> list();

	public Category get(int category_id);

	public void save(Category category);

	public void update(Category category);
	
	public void delete(int category_id);
}
