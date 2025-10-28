package com.itau.challenge.transaction_statistics_api.entities;

import com.itau.challenge.transaction_statistics_api.dto.TransactionRequest;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

    private BigDecimal amount;
    private Instant timestamp;

    public Transaction(TransactionRequest transactionRequest) {
        this.amount = transactionRequest.amount();
        this.timestamp = transactionRequest.timestamp();
    }
}
