package com.company;

import java.util.ArrayList;

public class Geometrie {
    static public double SomePerimCarre(ArrayList<Carre> tempArray){
        double somme = 0;
        for (Carre c : tempArray
             ) {
            somme += c.aire();
        }
        return somme;
    }
}
