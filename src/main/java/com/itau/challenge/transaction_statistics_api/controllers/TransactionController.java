package com.itau.challenge.transaction_statistics_api.controllers;

import com.itau.challenge.transaction_statistics_api.dto.TransactionRequest;
import com.itau.challenge.transaction_statistics_api.services.TransactionService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/api")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @PostMapping("/transaction")
    private ResponseEntity<Void> createTransaction(@Valid @RequestBody TransactionRequest body) {
        transactionService.createTransaction(body);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
