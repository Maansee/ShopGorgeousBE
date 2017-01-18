package com.niit.shopgorgeous.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shopgorgeous.dao.CategoryDAO;
import com.niit.shopgorgeous.model.Category;

@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO{
	

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void save(Category category) {
//		sessionFactory.getCurrentSession().saveOrUpdate(category);
		 Session session = sessionFactory.getCurrentSession();
		 session.saveOrUpdate(category);
	}

	@Transactional
	public void update(Category category) {
		sessionFactory.getCurrentSession().update(category);
	}

	@Transactional
	public void delete(int category_id) {
		Category category = new Category();
		category.setCategory_id(category_id);
		sessionFactory.getCurrentSession().delete(category);

	}

	@Transactional
	public Category get(int category_id) {
		return (Category) sessionFactory.getCurrentSession().get(Category.class, category_id);
	}
	
	@Transactional
	public List<Category> list() {
		String hql = "from Category";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		return query.list();
	}
}

	


