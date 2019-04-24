package com.beacon.model;

import java.util.Date;

import lombok.Data;

@Data
public class ComplianceExceptionSearchCriteria {
	private int complianceExceptionId;
	private String auditComponent;
	private String auditElement;
	private String auditDriver;
	private Date creationDateFrom;
	private Date creationDateThrough;
	
	
}
