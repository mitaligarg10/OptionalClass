package com.stackroute.withoptional.television;

import java.util.Optional;

public class Television {
    private long id;
    private String brand;
    private String name;
    private Optional<DisplayFeatures> displayFeatures;

    public Television(long id, String brand, String name, Optional<DisplayFeatures> displayFeatures){
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.displayFeatures = displayFeatures;
    }

    public long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public Optional<DisplayFeatures> getDisplayFeatures() {
        return displayFeatures;
    }
}
