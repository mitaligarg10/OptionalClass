package com.stackroute.nullpointerexception.television;

public class HDR {

    private String contrast;
    private String colour;

    public HDR(String contrast, String colour) {
        this.contrast = contrast;
        this.colour = colour;
    }

    public String getContrast() {
        return contrast;
    }

    public String getColour() {
        return colour;
    }
}
