package com.barrycommins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final AccountGateway accountGateway;

    @Autowired
    public AccountService(AccountRepository accountRepository, AccountGateway accountGateway) {
        this.accountRepository = accountRepository;
        this.accountGateway = accountGateway;
    }

    Account createAccount(Account account) {
        //TODO: add account creation logic
        Account created = accountRepository.save(account);
        accountGateway.sendAccountEvent(new AccountCreatedEvent(created));
        return  created;
    }
}
