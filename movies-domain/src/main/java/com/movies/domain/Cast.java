package com.movies.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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

	@Enumerated(EnumType.ORDINAL)
	private JobsEnumDomain job;

	@Column(name = "order")
	private Integer order;

	@Column(name = "profilePath")
	private String profilePath;
}
