package com.wipro.springboot.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wipro.springboot.entity.Order;
import com.wipro.springboot.entity.Product;

public interface IOrderService {
	Page<Order> findAll(Pageable pageable);

	Page<Order> findByStatus(Integer status, Pageable pageable);

	Page<Order> findByBuyerEmail(String email, Pageable pageable);

	Page<Order> findByBuyerPhone(String phone, Pageable pageable);

	Order findOne(Long orderId);

	Order finish(Long orderId);

	Order cancel(Long orderId);
	List<Order> findAll();
}
