

package com.ascetic_yuanma.tmall.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ascetic_yuanma.tmall.pojo.Order;
import com.ascetic_yuanma.tmall.pojo.OrderItem;
import com.ascetic_yuanma.tmall.pojo.Product;
import com.ascetic_yuanma.tmall.pojo.User;

public interface OrderItemDAO extends JpaRepository<OrderItem,Integer>{
	List<OrderItem> findByOrderOrderByIdDesc(Order order);
	List<OrderItem> findByProduct(Product product);
	List<OrderItem> findByUserAndOrderIsNull(User user);
}


