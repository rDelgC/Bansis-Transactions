package com.boot.bansis.transaction.controllers;

import com.boot.bansis.transaction.entities.Transaction;
import com.boot.bansis.transaction.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 *
 * @author rDelgC
 */
@RestController
@RequestMapping("/transaction")
public class TransactionRestController {
    
    @Autowired
    private TransactionService transactionService;
    
    @PostMapping("/save")
    public Mono<Transaction> saveTransaction(@RequestBody Transaction transaction) {
        return transactionService.save(transaction);
    }
}
