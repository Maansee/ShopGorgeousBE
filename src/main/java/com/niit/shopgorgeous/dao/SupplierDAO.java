package com.niit.shopgorgeous.dao;


import java.util.List;

import com.niit.shopgorgeous.model.Category;
import com.niit.shopgorgeous.model.Supplier;


public interface SupplierDAO {

	public List<Supplier> list();

	public Supplier get(int supplier_id);

	public void save(Supplier supplier);

	public void update(Supplier supplier);

	public void delete(int supplier_id);

}
