package org.ServiceAPI;

import org.example.BankCard;
import org.example.Subscription;
import org.example.User;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public interface Service {
    static void subscribe(BankCard name){
    }
    public static Optional<Subscription> getSubscriptionByBankCardNumber(String name){

        return null;
    }

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

    List<Integer> result = Arrays.asList(1, 2, 3, 4)
            .stream()
            .collect(Collectors.toUnmodifiableList());

    static OptionalDouble user() {
        return null;
    }


    public static boolean isPayableUser(int userAge){
        if (userAge > 18) {
            return false;
        } else {
            return true;
        }
    }

    default List<Subscription> getAllSubscriptionsByCondition(Predicate<Subscription>) {
        return null;
    }

}
