package org.example;

import java.time.LocalDate;

public class Subscription {
        BankCard bankcard;
        LocalDate startDate;

        public Subscription(BankCard bankcard, LocalDate startDate){
                this.bankcard = bankcard;
                this.startDate = startDate;
        }

        public BankCard getBankcard() {
                return bankcard;
        }

        public LocalDate getStartDate(){
                return startDate;
        }

}
