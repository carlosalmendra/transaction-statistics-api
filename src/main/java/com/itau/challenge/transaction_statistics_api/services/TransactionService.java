package com.itau.challenge.transaction_statistics_api.services;

import com.itau.challenge.transaction_statistics_api.dto.TransactionRequest;
import com.itau.challenge.transaction_statistics_api.entities.Transaction;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    public void createTransaction (TransactionRequest transactionRequest) {
        Transaction transaction = new Transaction(transactionRequest);
    }
}
