package org.exampleApp;

import org.ServiceAPI.Service;
import org.example.BankCard;
import org.example.BankCardType;
import org.example.User;
import org.exampleCloud.BankImplementation;
import org.exampleSeriveImpl.ServiceImplementation;
import org.service.Bank;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        // initialize all services
        Service service = new ServiceImplementation();
        Bank bank = new BankImplementation();
// create credit card
        BankCard creditCard = bank.createBankCard(new User("Tester", "Tester", LocalDate.now()), BankCardType.DEBIT);
// create debit card
        BankCard debitCard = bank.createBankCard(new User("Grigorii", "Berezin", LocalDate.of(1998, 6, 11)), BankCardType.DEBIT);
// subscribe both cards
        service.subscribe(creditCard);
        service.subscribe(debitCard);
// get all users (should be 2 users with Tester and Grigorii names)
        System.out.println(service.getAllUsers());
// get subscription by card name (exist)
        System.out.println(service.getSubscriptionByBankCardNumber(creditCard.getNumber()));
// get subscription by card name (doesn't exist)
        System.out.println(service.getSubscriptionByBankCardNumber("does not exist"));

    }
}
