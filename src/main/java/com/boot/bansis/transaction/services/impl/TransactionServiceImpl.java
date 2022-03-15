package com.boot.bansis.transaction.services.impl;

import com.boot.bansis.transaction.entities.Transaction;
import com.boot.bansis.transaction.repositories.TransactionRepository;
import com.boot.bansis.transaction.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 *
 * @author Demn
 */
@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionDao;

    @Override
    public Mono<Transaction> save(Transaction transaction) {
        return transactionDao.save(transaction);
    }
}
