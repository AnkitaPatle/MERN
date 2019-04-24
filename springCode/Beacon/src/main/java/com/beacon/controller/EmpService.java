package com.beacon.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class EmpService {
	
	@PersistenceContext
	private EntityManager entityManager;
/*	
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}

	public User find(long id) {
		return entityManager.find(User.class, id);
	}
	
	public List<Employee> findAll() {
		Query query = (Query) entityManager.createNamedQuery(
				"query_find_all_users", Employee.class);
		return query.getResultList();
	}*/
}