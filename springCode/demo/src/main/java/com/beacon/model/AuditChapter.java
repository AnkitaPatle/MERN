package com.beacon.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "AUDITCHAPTER")
public class AuditChapter implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 73670231659378147L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "CHAPTER_ID")
	private int chapterId;
	/*
	 * @Column(name = "CHAPTER_ID") private String cmsCode;
	 * 
	 * @Column(name = "CHAPTER_ID") private String ChapterName;
	 */
	@Column(name = "CHAPTER_NAME")
	private String chapterName;

	/*@OneToMany(mappedBy = "AUDITCHAPTER")
	private Set<AuditDriver> auditDrivers;*/

}
