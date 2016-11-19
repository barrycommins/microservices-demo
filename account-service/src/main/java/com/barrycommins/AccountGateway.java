package com.barrycommins;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway
interface AccountGateway {

    @Gateway(requestChannel = "output")
    void sendAccountEvent(AccountCreatedEvent accountCreatedEvent);
}
