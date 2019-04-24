package com.beacon.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

	/*@Query("SELECT new DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d LEFT JOIN d.employees e")
	List<DeptEmpDto> fetchEmpDeptDataLeftJoin();

	@Query("SELECT FROM Department d RIGHT JOIN d.employees e")
	List<DeptEmpDto> fetchEmpDeptDataRightJoin();

	@Query("Select d from department d join d.employees e")
	List<Department> fetchDept();*/
}