package com.te.bootwithstream.controller;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.te.bootwithstream.entity.Customer;
import com.te.bootwithstream.entity.Order;
import com.te.bootwithstream.entity.Product;
import com.te.bootwithstream.response.SuccessResponse;
import com.te.bootwithstream.service.CustomerService;
import com.te.bootwithstream.service.OrderService;
import com.te.bootwithstream.service.ProductService;

import jakarta.persistence.GeneratedValue;

@RestController
public class ProductController {

	@Autowired
	private ProductService service;
	
	@Autowired
	private CustomerService cService;
	
	@Autowired
	private OrderService oService;
	
	@PostMapping("/saveProduct")
	public ResponseEntity<SuccessResponse> saveProduct(@RequestBody Product product) {
		Product addProduct = service.addProduct(product);
		if (addProduct != null) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(addProduct).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().data(addProduct).error(true).msg("Failure").build(),
					HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/getDiscount")
	public ResponseEntity<SuccessResponse> getDiscount() {
		List<Product> discountList = service.productListwithDiscount();
		if (!discountList.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().obj(discountList).error(false).msg("success").build(), HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(
					SuccessResponse.builder().obj(discountList).error(true).msg("Failure").build(),
					HttpStatus.BAD_REQUEST);
		}
	}
	
	@PostMapping("/addCustomer")
	public ResponseEntity<?> addCustomer (@RequestBody Customer customer) {
		
		Optional <Customer> addCustomer = Optional.ofNullable(cService.addCustomer(customer));
		
		if (addCustomer.isPresent()) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(addCustomer).error(true).msg("ADDED").build(),HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(addCustomer).error(false).msg("NOT ADDED").build(),HttpStatus.BAD_GATEWAY);
		}
		
		
	}
	
	@GetMapping("/que1")
	public ResponseEntity<SuccessResponse> question1() {
		
		List<Product> all = service.getAll();
		
		List<Product> collect = all.stream().filter(i->i.getCategory().equalsIgnoreCase("BOOKS")).filter(i->i.getPrice()>100).collect(Collectors.toList());
		
		if (collect!=null) {
			
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().obj(collect).error(true).msg("FOUND").build(),HttpStatus.OK);
		} else {
            return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().obj(collect).error(false).msg("NOT FOUND").build(),HttpStatus.OK);
		}
		
	
	}
	
	@GetMapping("/que2")
	public ResponseEntity<SuccessResponse> question2() {
		
		List<Order> order = oService.getOrder();
		

		List<Order> collect = order.stream().filter(i->i.getProducts().stream().anyMatch(j->j.getCategory().equalsIgnoreCase("BABY"))).collect(Collectors.toList());
		
		if (collect!=null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().error(true).obj(collect).msg("FOUND").build(),HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().error(false).obj(collect).msg("NOT FOUND").build(),HttpStatus.BAD_GATEWAY);
		}
	
	}
	
	@GetMapping("/que3")
	public ResponseEntity<SuccessResponse> question3 () {
		
		List<Product> all = service.getAll();
		
		List<Product> collect = all.stream().filter(i->i.getCategory().equalsIgnoreCase("toys")).map(j->j.withPrice(j.getPrice()*0.9)).collect(Collectors.toList());
		
		if ((collect!=null)) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().error(true).obj(collect).msg("APPLIED THE DISCOUNT").build(),HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().error(true).obj(collect).msg("NOT APPLIED").build(),HttpStatus.NOT_FOUND);
		}
		
	}
	
	
	@GetMapping("/findWithSorting")
	public ResponseEntity<SuccessResponse> findProductWithSorting(String field) {
		List<Product> findProductWithSorting = service.findProductWithSorting(field);
		
		if (!findProductWithSorting.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().records(findProductWithSorting.size()).reponse(findProductWithSorting).build(),HttpStatus.OK);
		} else {
            return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().records(findProductWithSorting.size()).reponse(findProductWithSorting).build(),HttpStatus.BAD_GATEWAY);
		}
	}
	
	@GetMapping("/findWithPagination")
	public ResponseEntity<SuccessResponse> findProductWithPagination(Integer offset,Integer pageSize) {
		Page<Product> findProductWithPagination = service.findProductWithPagination(offset, pageSize);
		if (!findProductWithPagination.isEmpty()) {
		
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().records(findProductWithPagination.getSize()).reponse(findProductWithPagination).build(),HttpStatus.OK);
			
		} else {
            return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().records(findProductWithPagination.getSize()).reponse(findProductWithPagination).build(),HttpStatus.BAD_GATEWAY);     
		}
	}
	@GetMapping("/findWithPaginationAndSorting")
	public ResponseEntity<SuccessResponse> findProductWithPagination(Integer offset,Integer pageSize,String field) {
		Page<Product> findProductWithPagination = service.findProductWithPaginationAndSorting(offset, pageSize,field);
		if (!findProductWithPagination.isEmpty()) {
		
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().records(findProductWithPagination.getSize()).reponse(findProductWithPagination).build(),HttpStatus.OK);
			
		} else {
            return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().records(findProductWithPagination.getSize()).reponse(findProductWithPagination).build(),HttpStatus.BAD_GATEWAY);     
		}
	}
	
	
	@GetMapping("/q1")
	public ResponseEntity<SuccessResponse> ques1() {
		
		List<Product> all = service.getAll();
		
	        List<Product> books= all.stream().filter(i->i.getCategory().equalsIgnoreCase("BOOKS")).filter(o->o.getPrice()>100).collect(Collectors.toList());
		
		if (!books.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(books).msg("ADDED").build(),HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(books).msg("NOT ADDED").build(),HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
	
	@GetMapping("/q2")
	public ResponseEntity<SuccessResponse> ques2 () {
		List<Order> order = oService.getOrder();
		
		List<Product> collect = order.stream().flatMap(i->i.getProducts().stream().filter(o->o.getCategory().equalsIgnoreCase("BABY"))).collect(Collectors.toList());

		if (!collect.isEmpty()) {
			
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(collect).msg("FOUND").build(),HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(collect).msg("NOT FOUND").build(),HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/q3")
	public ResponseEntity<SuccessResponse> ques3() {
		
		List<Product> all = service.getAll();
		
		List<Product> collect = all.stream().filter(i->i.getCategory().equalsIgnoreCase("TOYS")).map(o->o.withPrice(o.getPrice()*0.9)).collect(Collectors.toList());
		
		if (!collect.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(collect).msg("APPLIED").build(),HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(collect).msg("woal").build(),HttpStatus.BAD_GATEWAY);
		}
	}
	
	@GetMapping("/q4")
	public ResponseEntity<SuccessResponse> ques4 () {
		
		List<Order> order = oService.getOrder();
		List<Order> collect= order.stream().filter(i->i.getCustomer().getTier() == 2).filter(o->o.getOrderDate().compareTo(LocalDate.of(2021,02,01))>=0).filter(o->o.getDeliveryDate().compareTo(LocalDate.of(2021,04,01))<=0).collect(Collectors.toList());
		
		if (!collect.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(collect).obj(collect).msg("FOUND").build(),HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(collect).obj(collect).msg("FOUND").build(),HttpStatus.OK);
		}
	}
	

	@GetMapping("/q5")
	public ResponseEntity<SuccessResponse> ques5 () {
		List<Product> all = service.getAll();
		
		Optional<Product> min = all.stream().filter(i->i.getCategory().equalsIgnoreCase("BOOKS")).sorted(Comparator.comparing(Product::getPrice)).findFirst();
		
		//Optional<Product> min = all.stream().filter(i->i.getCategory().equalsIgnoreCase("BOOKS")).min(Comparator.comparing(Product::getPrice));
		
		Product product = min.get();
		
		if (product!=null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(product).msg("found").build(),HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(product).msg("not found").build(),HttpStatus.BAD_GATEWAY);
		}
	}
	
	@GetMapping("/q6")
	public ResponseEntity<SuccessResponse> ques6 () {
		List<Order> order = oService.getOrder();
		
		List<Order> collect = order.stream().sorted(Comparator.comparing(Order::getOrderDate).reversed()).limit(3).collect(Collectors.toList());
		if (collect!=null) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(collect).msg("ADDED").build(),HttpStatus.OK);
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(collect).msg("NOT ADDED").build(),HttpStatus.BAD_GATEWAY);
		}
	}
	
	@GetMapping("/q7")
	public ResponseEntity<SuccessResponse> ques7 () {
		
		
		List<Order> order = oService.getOrder();
		
		List<Product> collect = order.stream().filter(i->i.getOrderDate().compareTo(LocalDate.of(2021, 03,15))==0).peek(o->System.out.println(o.toString())).flatMap(o->o.getProducts().stream()).collect(Collectors.toList());
		
		if (!collect.isEmpty()) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(collect).msg("ADDED").build(),HttpStatus.ACCEPTED);
			
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(collect).msg("NOT ADDED").build(),HttpStatus.BAD_GATEWAY);
		}
	}

	@GetMapping("/q8")
	public ResponseEntity<SuccessResponse> ques8() {
		
		List<Order> order = oService.getOrder();
		
		Stream<Long> map = order.stream().filter(i->i.getOrderDate().compareTo(LocalDate.of(2021, 02, 01))>=0)
		.filter(o->o.getOrderDate().compareTo(LocalDate.of(2021, 02, 28))<=0).map(p->p.getProducts().stream().count());
		
	List<Long>list=map.toList();
		if (!(list.isEmpty())) {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(list).msg("added").build(),HttpStatus.OK);
			
		} else {
			return new ResponseEntity<SuccessResponse>(SuccessResponse.builder().data(list).msg("NO added").build(),HttpStatus.BAD_GATEWAY);
		}
	}
	

}
