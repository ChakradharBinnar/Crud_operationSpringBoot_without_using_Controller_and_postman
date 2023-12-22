package com.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	/*
	 * @Query(value = "SELECT * FROM employee WHERE name LIKE 'chikku'", nativeQuery
	 * = true) List<Employee> FindByName();
	 */

	List<Employee> findByName(String name);
	
	Employee findByNameAndCity(String name, String city);
}