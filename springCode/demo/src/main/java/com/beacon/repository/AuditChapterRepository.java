package com.beacon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beacon.model.AuditChapter;

public interface AuditChapterRepository  extends JpaRepository<AuditChapter, Integer> {
	/*@Query("from AuditDriver ad inner join fetch ad.AuditChapter ac where ac.chapterId=:chapterId")
	public List<AuditDriver> findAllByAuditChapterId(@Param(value = "chapterId") int chapterId);
	*/
}
