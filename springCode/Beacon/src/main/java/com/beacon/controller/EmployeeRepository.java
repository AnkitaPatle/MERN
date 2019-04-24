package com.beacon.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@PersistenceContext 
	EntityManager em= null;	   
	@Query(value="select * from employee where id=:id", nativeQuery = true)
	public List<Employee> findByEmployeeId(@Param(value = "id") int id);
	
	
	@Query("from User u inner join fetch u.employee e inner join e.department d  where d.id=:id")
	//@Query("from User u inner join fetch u.employee e where e.id=?1")
	public  List<User> findUserByDepartmentId(@Param(value = "id") int id);
	
	///@Query("from User u inner join fetch u.employee e where e.id=:emp_id")
	@Query("from User u inner join fetch u.employee e where e.id=?1")
	public  List<User> findUserByEmpId(@Param(value = "emp_id") int emp_id);
	
	
	
	public default List<User> findUserByEmployeeId1(@Param(value = "id") int id){
		List<User>  userlist=	(List<User>) em.createNamedQuery("select u.* from users u inner join employee e on u.emp1_id = e.emp_id  where e.emp_id=?"
				+ "", User.class).setParameter(1, id);
		return userlist;
	}
	
	
	
	public List<Employee> findByDepartmentId(int id);
	/*@Query("SELECT new com.jeejava.dto.DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d INNER JOIN d.employees e")
	List<DeptEmpDto> fetchEmpDeptDataInnerJoin();

	@Query("SELECT new com.jeejava.dto.DeptEmpDto(d.name, e.name, e.email, e.address) "
			+ "FROM Department d, Employee e")
	List<DeptEmpDto> fetchEmpDeptDataCrossJoin();
*/
}