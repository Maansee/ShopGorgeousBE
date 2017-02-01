package com.niit.shopgorgeous.dao;

import com.niit.shopgorgeous.model.CustomerOrder;

public interface CustomerOrderDAO {

	void addCustomerOrder(CustomerOrder customerOrder);

	int getCustomerOrderGrandTotal(int cartId);
}
