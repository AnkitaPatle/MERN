package com.beacon.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Data;

@Data
@Entity
@Table(name = "AUDITELEMENT")
public class AuditElement implements Serializable {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "ELEMENT_ID", insertable = false, updatable = false)
	private int elementId;

	@Column(name = "ELEMENT_NAME")
	private String elementName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DRIVER_ID", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private AuditDriver auditDriver;


}
