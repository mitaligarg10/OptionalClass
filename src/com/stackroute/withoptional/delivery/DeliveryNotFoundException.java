package com.stackroute.withoptional.delivery;

public class DeliveryNotFoundException extends RuntimeException {
    public DeliveryNotFoundException(String id) {
        super("No delivery found for id: " + id);
    }
}
