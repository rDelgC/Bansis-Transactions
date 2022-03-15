package com.boot.bansis.transaction.services;

import com.boot.bansis.transaction.entities.Transaction;
import reactor.core.publisher.Mono;

/**
 *
 * @author Demn
 */
public interface TransactionService {

    public Mono<Transaction> save(Transaction transaction);
}
