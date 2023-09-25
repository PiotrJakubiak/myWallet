package com.jakpio.transactions.model;

import com.jakpio.transactions.enums.TransactionType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Getter
@Setter
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode(callSuper = true)
public class Transaction extends BaseEntity {

	String name;

	@Enumerated(EnumType.STRING)
	TransactionType type;

	BigDecimal amount;

	boolean active;

	Instant date;

	String category;

	String subCategory;

	String description;

	Long userId;

	Long groupId;

	Long tagId;
}
