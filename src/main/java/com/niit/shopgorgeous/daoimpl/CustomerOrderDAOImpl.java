package com.niit.shopgorgeous.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shopgorgeous.dao.CartDAO;
import com.niit.shopgorgeous.dao.CustomerOrderDAO;
import com.niit.shopgorgeous.model.Cart;
import com.niit.shopgorgeous.model.CartItem;
import com.niit.shopgorgeous.model.CustomerOrder;


@Repository
@Transactional
public class CustomerOrderDAOImpl implements CustomerOrderDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	CartDAO cartDAO;

	@Autowired
	CustomerOrderDAO customerOrderDAO;
	
	@Transactional
	public void addCustomerOrder(CustomerOrder customerOrder) {
		System.out.println("hello123");
		Session session = sessionFactory.getCurrentSession();
		System.out.println("cust1");
		session.saveOrUpdate(customerOrder);
		System.out.println("cust2");

	}

	@Transactional
	public int getCustomerOrderGrandTotal(int cartId) {
		int grandTotal = 0;
		System.out.println("cust71 :" +cartDAO.getCartByCartId(cartId));
		Cart cart = cartDAO.getCartByCartId(cartId);
		List<CartItem> cartItems= cart.getCartItems();
		System.out.println("cust81");
		for (CartItem item : cartItems) {
			grandTotal += item.getTotalprice();
		}
		System.out.println("cust91");
		return grandTotal;
	}
}
