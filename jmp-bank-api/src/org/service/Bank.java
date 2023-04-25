package org.service;

import org.example.BankCard;
import org.example.BankCardType;
import org.example.CreditBankCard;
import org.example.User;

public interface Bank {
    BankCard createBankCard(User user, BankCardType bankCardType);
    CreditBankCard::new;
}
