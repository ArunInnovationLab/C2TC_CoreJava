package com.tnsif.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {

		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"Telivision",25000f));
		productList.add(new Product(2,"Fridge",35000f));
		productList.add(new Product(3,"Washing Machine",45000f));
		productList.add(new Product(4,"Smartphone",25000f));
		productList.add(new Product(5,"Laptop",25000f));
		
		//Filter method
		List<Float> productPriceList = productList.stream().filter(p->p.price>30000).map(p->p.price).collect(Collectors.toList());
		System.out.println(productPriceList);
	
		//Reduce method 
		Float totalPrice = productList.stream().map(p->p.price).reduce(0.0f, (sum,p)->sum+p);
		System.out.println(totalPrice);
		
		//Stream iteration
		Stream.iterate(1, element->element+1).filter(element->element%2==0).limit(6).forEach(System.out::println);
	    
		//Stream Iteration over list
		productList.stream().filter(product->product.price==25000).forEach(product->System.out.println(product.name));
	}

}
