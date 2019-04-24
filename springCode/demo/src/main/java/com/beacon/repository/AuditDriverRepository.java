package com.beacon.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beacon.model.AuditDriver;
import com.beacon.model.AuditElement;
import com.beacon.model.ComplianceExceptionSearchCriteria;

@Repository
public interface AuditDriverRepository extends  JpaRepository<AuditDriver, Integer> {
	@PersistenceContext
	EntityManager em =null;
	
	
	@Query("from AuditDriver ad inner join fetch ad.auditChapter ac where ac.chapterName=?1")
	public List<AuditDriver> findAllByAuditChapter(@Param(value = "chapterName") String chapterName);
	


	@Query("from AuditElement ae inner join fetch ae.auditDriver ad where ad.driverName=?1")
	public List<AuditElement> findAllByAuditDriverName(@Param(value = "driverName") String driverName);
	
	
	@SuppressWarnings("unchecked")
	public default List<ComplianceExceptionSearchCriteria> searchComplianceExceptionDetails( ComplianceExceptionSearchCriteria complianceExceptionSearchCriteria){
		TypedQuery<ComplianceExceptionSearchCriteria> query=(TypedQuery<ComplianceExceptionSearchCriteria>) em.createQuery("");
		
		return query.getResultList();
		
	}

}
