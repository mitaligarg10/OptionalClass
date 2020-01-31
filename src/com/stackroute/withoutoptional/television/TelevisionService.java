package com.stackroute.withoutoptional.television;


public class TelevisionService {
    public String getTelevisionHDRColour(Television television){

        if(television != null){
            DisplayFeatures displayFeatures = television.getDisplayFeatures();
            if(displayFeatures != null){
                Hdr hdr = displayFeatures.getHdr();
                if(hdr != null){
                    return hdr.getColour();
                }
            }
        }
        return null;
    }
}
