package com.ag.Spring.Data.JPA.Mapping;

import com.ag.Spring.Data.JPA.Mapping.entity.*;
import com.ag.Spring.Data.JPA.Mapping.repository.*;
import org.apache.tomcat.util.security.Escape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringDataJpaMappingApplication implements CommandLineRunner {

	@Autowired
	private EmpRepo empRepo;

	@Autowired
	private MobileRepo mobileRepo;

	@Autowired
	private AddressRepo addressRepo;

	@Autowired
	private CategoryRepo categoryRepo;

	@Autowired
	private ProductRepo productRepo;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		One to One

//		Emp emp = new Emp();
//		emp.setEmpName("BeCoder");
//
//		Mobile mobile = new Mobile();
//		mobile.setMobileName("Samsung S23 Ultra");
//
//		emp.setMobile(mobile);
//
//		mobileRepo.save(mobile);
//		empRepo.save(emp);
//		System.out.println("Saved");

        /*

//		One to Many and Many to One
		Emp emp = new Emp();
		emp.setEmpName("AD");

		Address address = new Address();
		address.setAddress("UP");
		address.setType("UP");
		address.setEmp(emp);

		Address address2 = new Address();
		address2.setAddress("NY City");
		address2.setType("USA");
		address2.setEmp(emp);


		List<Address> listAdd = Arrays.asList(address, address2);

		emp.setAddress(listAdd);

		empRepo.save(emp);

		System.out.printf("Saved");

		// Get Many to One
		Address ad = addressRepo.findById(2).get();

		System.out.println(ad.getEmp().getEmpName());
*/

		// Many to Many
/*
		Category c1 = new Category();
		c1.setCategoryName("c1");

		Category c2 = new Category();
		c2.setCategoryName("c2");

		Product p1 = new Product();
		p1.setProductName("TV");

		c1.getProducts().add(p1);
		c1.getProducts().add(p1);

		c2.getProducts().add(p1);

		p1.getCategories().add(c1);
		p1.getCategories().add(c2);

		categoryRepo.save(c1);
		categoryRepo.save(c2);

		productRepo.save(p1);

		System.out.println("Save");
*/

		Category ca1 = categoryRepo.findById(1).get();
		System.out.println(ca1.getCategoryName());
		System.out.println(ca1.getProducts());
		ca1.getProducts().forEach(e ->
				System.out.println(e.getProductName())
		);


		Product pro1 = productRepo.findById(1).get();

//		System.out.println(pro1.getCategories().size());
		System.out.println(pro1.getProductName());

	}
}