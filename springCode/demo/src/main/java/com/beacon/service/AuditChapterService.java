package com.beacon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beacon.model.AuditChapter;
import com.beacon.repository.AuditChapterRepository;

@Service
public class AuditChapterService  {
	
	@Autowired
	AuditChapterRepository  auditChapterRepository;
	
	public List<AuditChapter> getAllAuditChapter(){
		return auditChapterRepository.findAll();
	}

}
