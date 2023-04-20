package org.ServiceAPI;

import jdk.internal.access.JavaNetHttpCookieAccess;
import org.example.BankCard;
import org.example.Subscription;
import org.example.User;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.LongStream;


public interface Service {
    static void subscribe(BankCard name){
    }
    public static Optional<Subscription> getSubscriptionByBankCardNumber(String name){

        return null;
    }

    int[] allUsersAge = new int[]{18, 12, 34};
    Date [] dates = {
            getDateFromString("25/11/2009"),
            getDateFromString("24/12/2009")
    };

    static Date getDateFromString(String dates) {
        Date result = dates.parse( dates );
        return result;
    }

    public default LongStream getAverageUsersAge(int[] allUsersAge){
        LocalDate today = LocalDate.now();
        final ChronoUnit DAYS;
        LongStream longStreamAverage = Arrays.stream(allUsersAge).average().stream().mapToLong(num -> (long) num);
        return longStreamAverage;

    }
    List<User> getAllUsers();

    public static boolean isPayableUser(int userAge){
        if (userAge > 18) {
            return false;
        } else {
            return true;
        }
    }

    Collectors.toUnmodifiableList();
}
