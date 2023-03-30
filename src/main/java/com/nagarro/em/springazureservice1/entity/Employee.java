package com.nagarro.em.springazureservice1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="employee")

public class Employee {
	
	@Id
	private Integer id;
	private String firstname;
	private String lastname;
	private Integer deptId;
	private long salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public Employee(Integer id, String firstname, String lastname, Integer deptId, long salary) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.deptId = deptId;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}

}
