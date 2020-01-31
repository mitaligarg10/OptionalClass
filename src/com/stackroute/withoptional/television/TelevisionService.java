package com.stackroute.withoptional.television;

import java.util.Optional;

public class TelevisionService {
    public String getTelevisionHDRColour(Optional<Television> television){
        return television.flatMap(Television::getDisplayFeatures)
                .flatMap(DisplayFeatures::getHdr)
                .map(Hdr::getColour)
                .orElse(null);

    }
}
