package com.beacon.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beacon.model.AuditChapter;
import com.beacon.model.AuditDriver;
import com.beacon.model.AuditElement;
import com.beacon.model.ComplianceExceptionSearchCriteria;
import com.beacon.repository.AuditDriverRepository;
import com.beacon.service.AuditChapterService;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class ComplianceExceptionController {

	@Autowired
	AuditDriverRepository auditDriverRepository;

	@Autowired
	AuditChapterService auditChapterService;

	@GetMapping("/getAllAuditChapter")
	public List<String> getAllAuditChapter() {
		return auditChapterService.getAllAuditChapter().stream().map(e -> e.getChapterName()).distinct()
				.collect(Collectors.toList());
	}

	@GetMapping("/getAllAuditDriver")
	public List<AuditDriver> getAllAuditDriver() {
		return auditDriverRepository.findAll();
	}

	@GetMapping("/getAllAuditDriverName")
	public List<String> getAllAuditDriverName() {
		List<AuditDriver> auditAuditDriverList = auditDriverRepository.findAll();
		return auditAuditDriverList.stream().map(e -> e.getDriverName()).distinct().sorted()
				.collect(Collectors.toList());
	}

	@GetMapping("/getAllAuditDriverNameByAuditChapter/{chapterName}")
	public List<String> getAllAuditDriverNameByAuditChapter(@PathVariable String chapterName) {
		List<AuditDriver> auditAuditDriverList = auditDriverRepository.findAllByAuditChapter(chapterName);
		return auditAuditDriverList.stream().map(e -> e.getDriverName()).distinct().collect(Collectors.toList());
	}

	@GetMapping("/getAllAuditElementNameByAuditDriver/{driverName}")
	public List<String> getAllAuditElementNameByAuditDriver(@PathVariable String driverName) {
		List<AuditElement> auditAuditDriverList = auditDriverRepository.findAllByAuditDriverName(driverName);
		return auditAuditDriverList.stream().map(e -> e.getElementName()).distinct().collect(Collectors.toList());
	}

	@PutMapping("/searchComplianceExceptionDetails/{complianceExceptionSearchCriteria}")
	public List<ComplianceExceptionSearchCriteria> searchComplianceExceptionDetails(
			@PathVariable ComplianceExceptionSearchCriteria complianceExceptionSearchCriteria) {
		List<ComplianceExceptionSearchCriteria> complianceExceptionSearchCriteriasList = auditDriverRepository
				.searchComplianceExceptionDetails(complianceExceptionSearchCriteria);
		return null;
	}

}
