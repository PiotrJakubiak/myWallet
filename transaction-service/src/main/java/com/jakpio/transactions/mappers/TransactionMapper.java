package com.jakpio.transactions.mappers;

import com.jakpio.transactions.dto.TransactionDto;
import com.jakpio.transactions.model.Transaction;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface TransactionMapper extends EntityMapper<TransactionDto, Transaction> {
}
