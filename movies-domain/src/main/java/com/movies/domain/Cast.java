package com.movies.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cast")
public class Cast implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6744435760472641747L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "character")
	private String character;

//	@Enumerated(EnumType.ORDINAL)
//	private JobsEnumDomain job;

	@Column(name = "order")
	private Integer order;

	@Column(name = "profilePath")
	private String profilePath;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

//	public JobsEnumDomain getJob() {
//		return job;
//	}
//
//	public void setJob(JobsEnumDomain job) {
//		this.job = job;
//	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getProfilePath() {
		return profilePath;
	}

	public void setProfilePath(String profilePath) {
		this.profilePath = profilePath;
	}

}
