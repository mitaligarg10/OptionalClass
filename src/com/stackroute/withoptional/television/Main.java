package com.stackroute.withoptional.television;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Hdr hdr = new Hdr("HIGH","BLACK");
        DisplayFeatures displayFeatures = new DisplayFeatures("55", Optional.of(hdr));
        Television television = new Television(1, "OnePlus", "UltraHD-TV", Optional.of(displayFeatures));

        TelevisionService televisionService = new TelevisionService();

        String colour = televisionService.getTelevisionHDRColour(Optional.of(television));
        System.out.println("OnePlus UltraHD-TV Screen colour in bits : " + colour);

        Television television1 = new Television(1, "OnePlus", "UltraHD-TV", Optional.empty());
        String colour1 = televisionService.getTelevisionHDRColour(Optional.of(television1));
        System.out.println("OnePlus UltraHD-TV Screen colour in bits : " + colour1);
    }
}
