package com.jakpio.transactions.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@MappedSuperclass
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class BaseEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@EqualsAndHashCode.Include
	private final String uuid = UUID.randomUUID().toString();

	@Version
	@Column(name = "version")
	private Integer version;

	@Column(name = "created_date")
	private Instant createdDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "last_modified_date")
	private Instant lastModifiedDate;

	@Column(name = "last_modified_by")
	private String lastModifiedBy;
}
