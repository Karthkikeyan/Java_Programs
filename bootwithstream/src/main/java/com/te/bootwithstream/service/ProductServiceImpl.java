package com.te.bootwithstream.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.te.bootwithstream.entity.Product;
import com.te.bootwithstream.repository.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	private ProductDAO dao;

	@Override
	public Product addProduct(Product product) {
		return dao.save(product);
	}

	@Override
	public List<Product> productListwithDiscount() {
		  List<Product> result = dao.findAll()
			        .stream()
			        .filter(p -> p.getName().equalsIgnoreCase("Toys"))
			        .map(p -> p.withPrice(p.getPrice() * 0.9))
			        .collect(Collectors.toList()); 
		return result;
	}

	@Override
	public List<Product> getAll() {
		
		return dao.findAll();
	}

	@Override
	public List<Product> findProductWithSorting(String field) {
		
		return dao.findAll(Sort.by(Sort.Direction.ASC, field));
	}

	@Override
	public Page<Product> findProductWithPagination(Integer offset, Integer pagesize) {

		return dao.findAll(PageRequest.of(offset, pagesize));
	}

	@Override
	public Page<Product> findProductWithPaginationAndSorting(Integer offset, Integer pagesize, String field) {
		
		return dao.findAll(PageRequest.of(offset,pagesize).withSort(Sort.by(field)));
	}
	
	
}
