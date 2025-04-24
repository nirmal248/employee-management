package com.nirmal.employee_management.API.repository;

import com.nirmal.employee_management.API.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
