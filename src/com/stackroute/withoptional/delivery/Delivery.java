package com.stackroute.withoptional.delivery;

import java.util.Optional;

public class Delivery {

    private final String title;
    private final Optional<DeliveryPerson> assignedTo;
    private final String id;

    public Delivery(String id, String title) {
        this.id = id;
        this.title = title;
        assignedTo = Optional.empty();
    }

    public Delivery(String id, String title, DeliveryPerson assignedTo) {
        this.id = id;
        this.title = title;
        this.assignedTo = Optional.ofNullable(assignedTo);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Optional<DeliveryPerson> getAssignedTo() {
        return assignedTo;
    }
}
