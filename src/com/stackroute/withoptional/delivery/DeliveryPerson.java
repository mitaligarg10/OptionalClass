package com.stackroute.withoptional.delivery;

import java.util.Optional;

public class DeliveryPerson {

    private final String personName;
    private final Optional<String> address;

    public DeliveryPerson(String personName) {
        this.personName = personName;
        this.address = Optional.empty();
    }

    public DeliveryPerson(String personName, String address) {
        this.personName = personName;
        this.address = Optional.ofNullable(address);
    }

    public String getPersonName() {
        return personName;
    }

    public Optional<String> getAddress() {
        return address;
    }
}
