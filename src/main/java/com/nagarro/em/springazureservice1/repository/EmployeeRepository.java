package com.nagarro.em.springazureservice1.repository;

import com.nagarro.em.springazureservice1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
