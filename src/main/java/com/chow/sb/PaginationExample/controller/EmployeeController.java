package com.chow.sb.PaginationExample.controller;

import com.chow.sb.PaginationExample.domain.Employee;
import com.chow.sb.PaginationExample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;
    @RequestMapping(value="/employees", method= RequestMethod.GET)
    public Page<Employee> getEmployees(Pageable pageable){
        return repository.findAll(pageable);
    }

    @RequestMapping(value="/del/{id}", method = RequestMethod.DELETE)
    public void remove(@PathVariable long id){
        repository.deleteById(id);
        System.out.println("Deleted");
    }
}
