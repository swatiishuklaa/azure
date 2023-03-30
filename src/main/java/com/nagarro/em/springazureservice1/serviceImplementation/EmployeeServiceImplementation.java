package com.nagarro.em.springazureservice1.serviceImplementation;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.em.springazureservice1.entity.Employee;
import com.nagarro.em.springazureservice1.repository.EmployeeRepository;
import com.nagarro.em.springazureservice1.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	private EmployeeRepository repo;
	
	@Override
	public Employee setNewEmployee(Employee employee) {
		repo.save(employee);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployeeList() {
		List<Employee> array = new ArrayList<Employee>();
		Employee employee = new Employee(1,"swati","shukla",501,5000);
		array.add(employee);
		return array;
	}

	@Override
	public Employee getEmployeeById(Integer id) {
		return repo.findById(id).orElse(new Employee());
	}

	@Override
	public Employee setDepartmentForAnEmployee(Employee employee) {
		return repo.save(employee);
	}


}
