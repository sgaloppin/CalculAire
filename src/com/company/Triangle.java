package com.company;

public class Triangle {
    private double cote;
    public Triangle (float cote){
        this.cote = cote;
    }
    public double perimetre (){
        return cote*3;
    }
    public double aire (){
        double aire = cote*cote*(Math.sqrt(3))/4;
        return aire;
    }
}
