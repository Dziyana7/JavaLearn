import org.example.cloud.BankImplementation;
import org.service.Bank;

module jmp.cloud.bank.impl {
    requires transitive jmp.bank.api;
    requires jmp.dto;
    exports org.example.cloud;
    provides Bank with BankImplementation;
}