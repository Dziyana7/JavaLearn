package org.service.api;

import org.example.BankCard;
import org.example.Subscription;
import org.example.User;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;


public interface Service {
    void subscribe(BankCard name);
    Subscription getSubscriptionByBankCardNumber(String name);

    List<User> getAllUsers();

    default double getAverageUsersAge() { // first get the years old for all users by difference between current date and birthday, them calculate average
        LocalDate now = LocalDate.now();
        OptionalDouble optAverage = getAllUsers().stream()
                .mapToLong(user -> Duration.between(now, user.getBirthday()).get(ChronoUnit.YEARS))
                .average();
        if (optAverage.isPresent()) {
            return optAverage.getAsDouble();
        } else {
            return 0;
        }
    }


    public static boolean isPayableUser(User user){
        LocalDate now = LocalDate.now();
        long age = Duration.between(now, user.getBirthday()).get(ChronoUnit.YEARS);
        return age <= 18;
    }

    List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription> subs);


}
