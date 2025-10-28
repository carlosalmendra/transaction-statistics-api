package com.itau.challenge.transaction_statistics_api.entities;

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

}
