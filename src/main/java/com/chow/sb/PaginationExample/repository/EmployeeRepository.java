package com.chow.sb.PaginationExample.repository;

import com.chow.sb.PaginationExample.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
