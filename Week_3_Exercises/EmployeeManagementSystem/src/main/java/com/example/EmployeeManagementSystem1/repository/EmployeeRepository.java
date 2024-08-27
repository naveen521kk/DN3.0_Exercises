package com.example.EmployeeManagementSystem1.repository;

import com.example.EmployeeManagementSystem1.Employee;
import com.example.EmployeeManagementSystem1.EmployeeCustomDTO;
import com.example.EmployeeManagementSystem1.EmployeeDTO;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Derived query method to find employees by name
    List<Employee> findByName(String name);

    // Derived query method to find employees by department id
    List<Employee> findByDepartmentId(Long departmentId);
 // Find employees by their email
    Employee findByEmail(String email);
 // Find employees whose name starts with a specific prefix
    List<Employee> findByNameStartingWith(String prefix);
    
    // Find employees whose name contains a specific substring
    List<Employee> findByNameContaining(String substring);
 // Custom query using JPQL to find employees by department name
    @Query("SELECT e FROM Employee e WHERE e.department.name = :departmentName")
    List<Employee> findByDepartmentName(@Param("departmentName") String departmentName);

    // Custom query using native SQL to find employees by name and email
    @Query(value = "SELECT * FROM employee e WHERE e.name = :name AND e.email = :email", nativeQuery = true)
    List<Employee> findByNameAndEmail(@Param("name") String name, @Param("email") String email);
    
    @Query(name = "Employee.findByDepartmentName")
    List<Employee> findByDepartmentName2(@Param("departmentName") String departmentName);
    
 // Pagination with a method that returns a Page of Employee objects
  //  Page<Employee> findAll(Pageable pageable);
    
 // Sorting with a method that returns a List of Employee objects
    List<Employee> findAll(Sort sort);
    
 // Pagination and sorting combined in a single method
    Page<Employee> findAll(Pageable pageable);
    List<EmployeeNameEmailProjection> findByDepartmentName(String departmentName);
    @Query("SELECT new com.example.employeemanagementsystem.EmployeeDTO(e.name, d.name) " +
            "FROM Employee e JOIN e.department d WHERE d.name = :departmentName")
     List<EmployeeDTO> findEmployeesInDepartment(@Param("departmentName") String departmentName);
    
    @Query("SELECT new com.example.employeemanagementsystem.EmployeeCustomDTO(" +
    	       "CONCAT(e.name, ' - ', d.name)) " +
    	       "FROM Employee e JOIN e.department d WHERE d.name = :departmentName")
    	List<EmployeeCustomDTO> findCustomEmployeeInfo(@Param("departmentName") String departmentName);


}

