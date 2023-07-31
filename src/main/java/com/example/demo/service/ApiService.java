	package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;
@Service
public class ApiService {
@Autowired
EmployeeRepo repository;
public String addEmployee(Employee p) {
repository.save(p);
return "Employee is Added";
}
//sorting
public List<Employee> getEmployeeSorted(String field){
return repository.findAll(Sort.by(Sort.Direction.DESC,field));
}
//pagination
public List<Employee> getEmployeeWithPagination(@PathVariable int offset,@PathVariable int pageSize){
Page<Employee> page=repository.findAll(PageRequest.of(offset, pageSize));
return page.getContent();
}
//sorting and paging
public List<Employee> getEmployeeWithPagingAndSorting(int offset,int pageSize,String field){
PageRequest paging =PageRequest.of(offset, pageSize,Sort.by(field));
Page<Employee> page = repository.findAll(paging);
return page.getContent();
}
}