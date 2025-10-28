package com.itau.challenge.transaction_statistics_api.dto;

import java.math.BigDecimal;
import java.time.Instant;

public record TransactionRequest (BigDecimal amount, Instant timestamp) {
}
