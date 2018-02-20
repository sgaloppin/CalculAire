package com.company;

public class Carre {
    private double cote;
    Carre (double cote){
        this.cote=cote;
    }
    double perimetre (){
        return 4*cote;
    }
    double aire (){
        return cote*cote;
    }
}
