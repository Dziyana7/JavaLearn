package org.example.serive.impl;

import org.example.BankCard;
import org.example.Subscription;
import org.example.User;
import org.service.api.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ServiceImplementation implements Service {
    private final List<Subscription> subscriptions = new ArrayList<>();

    @Override
    public void subscribe(BankCard name) {
        Subscription subscription = new Subscription(name, LocalDate.now());
        subscriptions.add(subscription);

    }

    @Override
    public Subscription getSubscriptionByBankCardNumber(String name) {
        return subscriptions.stream().filter(subscription -> subscription.getBankcard()
                .getNumber()
                .equals(name))
                .findAny()
                .orElseThrow();
    }

    public List<User> getAllUsers() {
        return subscriptions.stream().map(subscription -> subscription.getBankcard().getUser())
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> subs) {
        return subscriptions.stream().filter(subs).toList();
    }


}
