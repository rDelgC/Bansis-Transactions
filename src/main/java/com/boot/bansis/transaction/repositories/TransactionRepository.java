package com.boot.bansis.transaction.repositories;

import com.boot.bansis.transaction.entities.Transaction;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Demn
 */
@Repository
public interface TransactionRepository extends ReactiveMongoRepository<Transaction, String> {
    
}
