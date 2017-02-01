package com.niit.shopgorgeous.dao;

import java.util.List;

import com.niit.shopgorgeous.model.UserCustomer;



public interface UserDAO {


		public List<UserCustomer> list();

		public UserCustomer get(int id);

		public UserCustomer validate(String id, String password);

		public void save(UserCustomer user);

		public boolean update(UserCustomer user);
		
		public UserCustomer get(String username);
		
		
		
		

	}

		

