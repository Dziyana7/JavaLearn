import org.service.Bank;

module jmp.cloud.bank.impl {
    requires transitive jmp.bank.api;
    requires jmp.dto;
    exports org.exampleCloud;
    provides Bank with BankImplementation;
}