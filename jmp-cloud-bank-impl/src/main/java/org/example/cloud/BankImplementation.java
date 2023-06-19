package org.example.cloud;

import org.example.*;
import org.service.Bank;

import java.util.UUID;

public class BankImplementation implements Bank {
    @Override
    public BankCard createBankCard(User user, BankCardType bankCardType) {
        String uuid = UUID.randomUUID().toString();
        return switch (bankCardType){
            case DEBIT -> new DebitBankCard(uuid, user);
            case CREDIT -> new CreditBankCard(uuid, user);
        };
    }

}



