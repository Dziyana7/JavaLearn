import org.service.Bank;

module jmp.bank.api {
    requires jmp.dto;
    exports org.service;
    provides Bank with BankImplementation;

}