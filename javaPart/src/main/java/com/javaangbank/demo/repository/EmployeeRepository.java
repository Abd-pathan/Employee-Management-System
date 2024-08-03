package com.javaangbank.demo.repository;

import org.springframework.stereotype.Repository;
import com.javaangbank.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    
}
