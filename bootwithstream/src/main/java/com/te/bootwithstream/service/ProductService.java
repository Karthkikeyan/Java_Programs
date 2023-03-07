package com.te.bootwithstream.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.te.bootwithstream.entity.Product;

public interface ProductService {
 public Product addProduct(Product product);
 
 public List<Product> productListwithDiscount();
 
 public List<Product> getAll();
 
 public List<Product> findProductWithSorting(String field);
 
 public Page<Product> findProductWithPagination(Integer offset,Integer pagesize);
 
 public Page<Product> findProductWithPaginationAndSorting(Integer offset,Integer pagesize,String field);
} 
