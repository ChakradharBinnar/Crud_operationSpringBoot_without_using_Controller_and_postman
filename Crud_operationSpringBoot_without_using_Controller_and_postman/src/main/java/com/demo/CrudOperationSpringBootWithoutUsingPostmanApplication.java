package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.demo.entity.Employee;
import com.demo.repo.EmployeeRepo;

@SpringBootApplication
public class CrudOperationSpringBootWithoutUsingPostmanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(CrudOperationSpringBootWithoutUsingPostmanApplication.class, args);

		EmployeeRepo repo = context.getBean(EmployeeRepo.class);

		// Save Records---------------------------------------->

		/*
		 * Employee emp = new Employee();
		 *
		 * emp.setName("Chikku"); emp.setCity("Nashik"); emp.setSalary(150000);
		 *
		 * Employee e = repo.save(emp);
		 *
		 * System.out.println(e);
		 * System.out.println("Employee inserted sucessfully...!");
		 */

		/*
		 * Employee emp = new Employee();
		 *
		 * emp.setName("Gaurav"); emp.setCity("Nahsik"); emp.setSalary(140000);
		 *
		 * Employee e = repo.save(emp);
		 *
		 * System.out.println(e);
		 * System.out.println("Employee inserted sucessfully...!");
		 */

		// Find All Records---------------------------------------->

		/*
		 * List<Employee> list =repo.findAll();
		 *
		 * list.forEach(e->{ System.out.println(e); });
		 */

		// FindById Records---------------------------------------->

		/*
		 * Optional<Employee> emp = repo.findById(52); System.out.println(emp);
		 */

		// Save All Records---------------------------------------->

		/*
		 * Employee emp = new Employee();
		 *
		 * emp.setName("nayan"); emp.setCity("Nashik"); emp.setSalary(140000);
		 *
		 * Employee emp1 = new Employee();
		 *
		 * emp.setName("Akash"); emp.setCity("Jalgoan"); emp.setSalary(124000);
		 *
		 * List<Employee> list = List.of(emp, emp1); List<Employee> li
		 * =repo.saveAll(list);
		 *
		 * li.forEach(e->{ System.out.println(e); });
		 *
		 * System.out.println("All records inserted Sucessfully");
		 */

		// FindByName All Records By
		// NativeQuery---------------------------------------->

		/*
		 * List<Employee> list =repo.FindByName();
		 *
		 * list.forEach(e->{ System.out.println(e); });
		 */

		// FindByName All Records without
		// NativeQuery---------------------------------------->

		/*
		 * List<Employee> list = repo.findByName("soham");
		 *
		 * list.forEach(e -> { System.out.println(list); });
		 */

		// Delete by id---------------------------------------->

		/*
		 * repo.deleteById(103); System.out.println("Employee deleted Sucessfully...!");
		 */
		
		Employee emp=repo.findByNameAndCity("Chikku", "nashik");
		System.out.println(emp);
		
	}

}
