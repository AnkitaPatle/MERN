package com.beacon.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Data;

@Data
@Entity
@Table(name="AUDITDRIVER" )
public class AuditDriver implements Serializable {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "DRIVER_ID",insertable = false, updatable = false)
	private int driverId;
	
	@Column(name="DRIVER_NAME")
	private String driverName;
	
	/*@Column(name = "CMS_CODE")
	private String cmsCode;
	
	@Column(name="DRIVER_ID")
	private int chapterId;
	@Column(name="DESCRIPTION")
	private String description;
	@Column(name="DRIVER_ID")
	private List<Integer> memberElementsIdList = new LinkedList<Integer>();*/
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CHAPTER_ID", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private AuditChapter auditChapter;

	
}