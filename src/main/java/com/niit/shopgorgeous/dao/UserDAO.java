package com.niit.shopgorgeous.dao;

import java.util.List;

import com.niit.shopgorgeous.model.User;

public interface UserDAO {


		public List<User> list();

		public User get(int id);

		public User validate(String id, String password);

		public void save(User user);

		public boolean update(User user);
		
		
		
		

	}

		

