package com.wipro.springboot.vo.response;

import java.util.List;

import com.wipro.springboot.entity.Order;

public class OrderResponse {



	private List<Order> orderList;

	public List<Order> getProductList() {
		return orderList;
	}

	public void setProductList(List<Order> productList) {
		this.orderList = productList;
	}

}
