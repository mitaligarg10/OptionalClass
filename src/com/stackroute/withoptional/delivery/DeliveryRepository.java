package com.stackroute.withoptional.delivery;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DeliveryRepository {
    private final Map<String, Delivery> deliveryMap = new HashMap<>();

    public void loadData() {
        deliveryMap.put("1", new Delivery("1", "hello java 1"));
        deliveryMap.put("2", new Delivery("2", "hello java 2"));
        deliveryMap.put("3", new Delivery("3", "hello java 3"));
        deliveryMap.put("4", new Delivery("4", "hello java 4"));
        deliveryMap.put("5", new Delivery("5", "hello java 5"));
    }

    public Delivery find(String id) {
        return Optional.ofNullable(deliveryMap.get(id))
                .orElseThrow(() -> new DeliveryNotFoundException(id));
    }

    public Optional<String> deliveryAssignedTo(String id) {
        return Optional.ofNullable(find(id))
                .flatMap(delivery -> delivery.getAssignedTo())
                .map(deliveryPerson -> deliveryPerson.getPersonName());
    }
}
