package com.stackroute.withoptional.television;

import java.util.Optional;

public class DisplayFeatures {

    private String size; // In inches
    private Optional<Hdr> hdr;

    public DisplayFeatures(String size, Optional<Hdr> hdr){
        this.size = size;
        this.hdr = hdr;
    }

    public String getSize() {
        return size;
    }
    public Optional<Hdr> getHdr() {
        return hdr;
    }

}
