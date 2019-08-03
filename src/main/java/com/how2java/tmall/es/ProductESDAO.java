

package com.ascetic_yuanma.tmall.es;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.ascetic_yuanma.tmall.pojo.Product;

public interface ProductESDAO extends ElasticsearchRepository<Product,Integer>{

}


