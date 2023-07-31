package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Employee;
import com.example.demo.service.ApiService;
@RestController
public class ApiController {
@Autowired
ApiService service;
@PostMapping("/")
public String add(@RequestBody Employee e) {
return service.addEmployee(e);
}
//Sorting
@GetMapping("/{field}")
public List<Employee> produictWithSort(@PathVariable String field){
return service.getEmployeeSorted(field);
}
//pagination
@GetMapping("/{offset}/{pageSize}")
public List<Employee> productWithPagination(@PathVariable int offset,@PathVariable int pageSize){
return service.getEmployeeWithPagination(offset,pageSize);
}
//sorting and paging
@GetMapping("/{offset}/{pageSize}/{field}")
public List<Employee> getProductsWithPaginationAndSorting(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field){
return service.getEmployeeWithPagingAndSorting(offset,pageSize,field);
}
}

