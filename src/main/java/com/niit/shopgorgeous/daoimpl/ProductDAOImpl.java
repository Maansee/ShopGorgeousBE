package com.niit.shopgorgeous.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shopgorgeous.dao.ProductDAO;
import com.niit.shopgorgeous.model.Category;
import com.niit.shopgorgeous.model.Product;
import com.niit.shopgorgeous.model.Supplier;


@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public void save(Product product) {
//		sessionFactory.getCurrentSession().saveOrUpdate(product);
		Session session = sessionFactory.getCurrentSession();
		 session.saveOrUpdate(product);
	}

	@Transactional
	public void update(Product product) {
		sessionFactory.getCurrentSession().update(product);
		
	}

	@Transactional
	public void delete(int productid) {
		Product product = new Product();
		product.setProductid(productid);
		sessionFactory.getCurrentSession().delete(product);
		
	}

	@Transactional
	public Product get(int productid) {
		return (Product) sessionFactory.getCurrentSession().get(Product.class, productid);
	}

	
	@Transactional
	public List<Product> list() {
		String hql = "from Product";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
	
	@Transactional
	public List<Category> listcatgname() {
		String hql = "Select category_name from Category";
		Query query = sessionFactory.openSession().createQuery(hql);
		return query.list();
	}

	@Transactional
	public List<Supplier> listsuplname() {
		String hql = "Select supplier_name from Supplier";
		Query query = sessionFactory.openSession().createQuery(hql);
		return query.list();
	}

}
