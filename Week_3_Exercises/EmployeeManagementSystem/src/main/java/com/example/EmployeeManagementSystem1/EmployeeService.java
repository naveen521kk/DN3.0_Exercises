package com.example.EmployeeManagementSystem1;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.persistence.EntityManager;
@Service
public class EmployeeService {
    @Autowired
    private EntityManager entityManager;

    public void batchInsertEmployees(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) 
        {
            entityManager.persist(employees.get(i));
            if (i % 50 == 0) 
            { 
            	// Flush and clear batch every 50 inserts
                entityManager.flush();
                entityManager.clear();
            }
        }
    }
}
