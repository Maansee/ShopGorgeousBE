package com.niit.shopgorgeous.daoimpl;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shopgorgeous.dao.UserDAO;
import com.niit.shopgorgeous.model.User;

@SuppressWarnings("deprecation")
@Transactional
@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> list() {

		String hql = "from User";

		Query query = sessionFactory.getCurrentSession().createQuery(hql);

		return query.list();
	}

	@Transactional
	public User get(int id) {
		return (User) sessionFactory.getCurrentSession().get(User.class, id);

	}
	 
	@Transactional
	public User validate(String id, String password) {
		System.out.println("inside validate");
		String hql = "from User where id ='" + id + "'  and password='" + password + "'";
		System.out.println("After hql");
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		System.out.println("after query");
		return (User) query.uniqueResult();

	}

	@Transactional
//	public void save(User user) {
//
//	System.out.println("Save User");
//			sessionFactory.getCurrentSession().saveOrUpdate(user);
//	}
		
	public boolean update(User user) {
		try {
			sessionFactory.getCurrentSession().update(user);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}


	
	@Transactional
	public void save(User user) {
//		sessionFactory.getCurrentSession().saveOrUpdate(user);
	    Session session = sessionFactory.getCurrentSession();
//	    user.setRole("ROLE_ADMIN");
	    user.setRole("ROLE_USER");
	    session.saveOrUpdate(user);

}
}
