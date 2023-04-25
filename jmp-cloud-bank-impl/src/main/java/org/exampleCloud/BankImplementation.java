package org.exampleCloud;

import org.example.*;
import org.service.Bank;

import java.util.UUID;
import java.util.function.BiFunction;

public class BankImplementation implements Bank {
    @Override
    public BankCard createBankCard(User user, BankCardType bankCardType) {
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        BiFunction<String, User, BankCard> debitCons = DebitBankCard::new;
        BiFunction<String, User, BankCard> creditCons = CreditBankCard::new;
        return switch (bankCardType){
            case DEBIT -> debitCons.apply(uuidAsString, user);
            case CREDIT -> creditCons.apply(uuidAsString, user);
        };
    }

}



