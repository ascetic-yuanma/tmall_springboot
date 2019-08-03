

package com.ascetic_yuanma.tmall.dao;
 

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ascetic_yuanma.tmall.pojo.Product;
import com.ascetic_yuanma.tmall.pojo.Property;
import com.ascetic_yuanma.tmall.pojo.PropertyValue;

public interface PropertyValueDAO extends JpaRepository<PropertyValue,Integer>{

	List<PropertyValue> findByProductOrderByIdDesc(Product product);
	PropertyValue getByPropertyAndProduct(Property property, Product product);

	
	
	
}


