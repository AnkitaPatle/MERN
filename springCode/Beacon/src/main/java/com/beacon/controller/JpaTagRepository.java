package com.beacon.controller;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

@Repository
class JpaTagRepository implements EmployeeRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Employee> findAll() {
		return this.entityManager.createQuery("SELECT t from employee  t", Employee.class)
				.getResultList();
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteInBatch(Iterable<Employee> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employee> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> findAllById(Iterable<Integer> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee getOne(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> List<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> S saveAndFlush(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Employee> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Employee arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Employee> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existsById(Integer arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Employee> findById(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> S save(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Employee> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Employee> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employee> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public List<Employee> findByDepartmentId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
*/
}