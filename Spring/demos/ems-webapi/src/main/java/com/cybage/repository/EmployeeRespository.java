package com.cybage.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cybage.model.Employee;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long>{

	//1. Querydsl custom query
	Employee findByEname(String name);
	
	//and
	
	//2. @Query with JPA queries
	@Query("select e from Employee e where e.desgn like ?1")
	List<Employee>  getByDesign(String desgn);
	
	//or
	
	//3.@query native queries
	@Query(value="select * from employee where ename= ?1",nativeQuery=true)
	Employee getByname(String name);
}
