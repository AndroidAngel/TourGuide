package com.teamandroidangel.iamangelauditor.tourguide;

/**
 * Created by iamangelauditor on 10/12/2017.
 */

public class Attraction {

    private String mainLabel;

    private String firstLabel;
    private  String secondLabel;
    private int firstImageResource = NO_IMAGE_PROVIDED;
    private int secondImageResource = IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int IMAGE_PROVIDED = 1;

    public Attraction (String mainLabel, int firstImageResource, String firstLabel,int secondImageResource,String secondLabel){
        this.mainLabel = mainLabel;
        this.firstLabel = firstLabel;
        this.secondLabel = secondLabel;
        this.firstImageResource = firstImageResource;
        this.secondImageResource = secondImageResource;
    }
    public String getMainLabel(){
        return mainLabel;
    }
    public String getFirstLabel(){
        return firstLabel;
    }
    public String getSecondLabel(){
        return secondLabel;
    }
    public int getFirstImageResource(){
        return firstImageResource;
    }
    public int getSecondImageResource(){
        return secondImageResource;
    }
    public boolean hasImage(){
        return firstImageResource  != NO_IMAGE_PROVIDED;
    }



}
