package com.nespresso.exercices.pyramid;


public enum StoneQuality {

    highQuality("X"), lowQuality("V");
    
    public String display;
    
    StoneQuality(String display){
        this.display = display;
    }
}
