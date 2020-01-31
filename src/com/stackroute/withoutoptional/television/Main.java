package com.stackroute.withoutoptional.television;

public class Main {
    public static void main(String[] args) {
        Hdr hdr = new Hdr("HIGH","BLACK");
        DisplayFeatures displayFeatures = new DisplayFeatures("55",hdr);
        Television television = new Television(1, "OnePlus", "UltraHD-TV", displayFeatures);

        TelevisionService televisionService = new TelevisionService();

        String colour = televisionService.getTelevisionHDRColour(television);
        System.out.println("OnePlus UltraHD-TV Screen colour in bits : " + colour);

        Hdr hdr1 = new Hdr(null,null);
        DisplayFeatures displayFeatures1 = new DisplayFeatures(null,hdr1);
        Television television1 = new Television(1, "OnePlus", "UltraHD-TV",displayFeatures1);
        String colour1 = televisionService.getTelevisionHDRColour(television1);
        System.out.println("OnePlus UltraHD-TV Screen colour in bits : " + colour1);
    }
}
