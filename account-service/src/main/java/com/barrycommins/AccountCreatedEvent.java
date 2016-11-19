package com.barrycommins;

import lombok.Data;
import lombok.NonNull;

@Data
class AccountCreatedEvent {

    @NonNull
    Account account;
}
