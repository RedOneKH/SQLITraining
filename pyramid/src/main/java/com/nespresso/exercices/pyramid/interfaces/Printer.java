package com.nespresso.exercices.pyramid.interfaces;

import java.util.List;

import com.nespresso.exercices.pyramid.PyramidLayer;
import com.nespresso.exercices.pyramid.StoneQuality;


public interface Printer {

    public String printPyramid(List<PyramidLayer> pyramidLayers);
    public String printPyramidLayer(StoneQuality stoneQuality, int stonesCount, 
                                    int emptyStonePlaces, int blankPlacesCount);
}
