package org.example.app;

import java.util.Optional;

public class Exception {
    Optional<Integer> getSubscriptionByBankCardNumber = Optional.ofNullable(Optional.of(34)
            .orElseThrow());
}
