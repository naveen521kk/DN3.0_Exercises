package com.example.EmployeeManagementSystem1.repository;

import com.example.EmployeeManagementSystem1.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // Derived query method to find departments by name
    Department findByName(String name);
 // Find departments whose name starts with a specific prefix
    List<Department> findByNameStartingWith(String prefix);
    
    // Find departments whose name contains a specific substring
    List<Department> findByNameContaining(String substring);
}
