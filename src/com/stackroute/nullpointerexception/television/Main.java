package com.stackroute.nullpointerexception.television;

public class Main {
    public static void main(String[] args) {

        HDR hdr = new HDR("HIGH", "Black");
        DisplayFeatures displayFeatures = new DisplayFeatures("55", hdr);
        Television television = new Television(1, "OnePlus", "UltraHD-TV", displayFeatures);

        TelevisionService televisionService = new TelevisionService();

        String colour = televisionService.getTelevisionHDRColour(television);

        System.out.println("OnePlus UltraHD-TV Screen colour in bits : " + colour);

        DisplayFeatures displayFeatures1 = new DisplayFeatures(null, null);
        Television television1 = new Television(1, "OnePlus", "UltraHD-TV", displayFeatures1);
        String colour1 = televisionService.getTelevisionHDRColour(television1);
        System.out.println("OnePlus UltraHD-TV Screen colour in bits : " + colour1);

    }
}
