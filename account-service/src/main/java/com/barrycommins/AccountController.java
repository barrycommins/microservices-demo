package com.barrycommins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/account")
class AccountController {

    //TODO: dummy method, remove
    @RequestMapping(method = RequestMethod.GET)
    String getAccount(){
        return "Hello";
    }
}
