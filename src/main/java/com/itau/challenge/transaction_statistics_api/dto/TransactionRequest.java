package com.itau.challenge.transaction_statistics_api.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.time.Instant;

public record TransactionRequest(@NotNull @Positive BigDecimal amount,
                                 @NotNull Instant timestamp) {
}
