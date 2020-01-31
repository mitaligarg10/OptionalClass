package com.stackroute.nullpointerexception.television;


import com.stackroute.nullpointerexception.television.DisplayFeatures;
import com.stackroute.nullpointerexception.television.HDR;
import com.stackroute.nullpointerexception.television.Television;

public class TelevisionService {
    public String getTelevisionHDRColour(Television television) {

        if (television != null) {
            DisplayFeatures displayFeatures = television.getDisplayFeatures();
            if (displayFeatures != null) {
                HDR hdr = displayFeatures.getHdr();
                return hdr.getColour();
            }
        }
        return null;
    }
}
