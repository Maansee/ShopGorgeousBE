package com.niit.shopgorgeous.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shopgorgeous.dao.SupplierDAO;

import com.niit.shopgorgeous.model.Supplier;



@Repository("SupplierDAO")
public class SupplierDAOImpl implements SupplierDAO{

	@Autowired
	private SessionFactory sessionFactory;

	
	@Transactional
	public List<Supplier> list() {
		String hql = "from Supplier";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}

	
	@Transactional
	public Supplier get(int supplier_id) {
		
		return (Supplier) sessionFactory.getCurrentSession().get(Supplier.class, supplier_id);
	}

	@Transactional
	public void save(Supplier supplier) {
	sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		// Session session = sessionFactory.getCurrentSession();
		 //session.saveOrUpdate(supplier);
	}

	@Transactional
	public void update(Supplier supplier) {
		
		sessionFactory.getCurrentSession().update(supplier);
	}

	@Transactional
	public void delete(int supplier_id) {
		
		Supplier supplier = new Supplier();
		supplier.setSupplier_id(supplier_id);
		sessionFactory.getCurrentSession().delete(supplier);
		
	}

	
	
}
