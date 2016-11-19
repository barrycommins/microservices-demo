package com.barrycommins;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/account")
class AccountController {

    private final AccountService accountService;

    AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    Account getAccount(){
        //TODO: account lookup from credentials
        throw new AccountNotFoundException();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    @ResponseBody
    Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(AccountNotFoundException.class)
    void handleAccountNotFound(){

    }
}
