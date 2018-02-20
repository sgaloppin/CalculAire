package com.company;

import java.util.ArrayList;

public class ConstructeurPoly {
    ArrayList<Carre> carreTab;
    ArrayList<Triangle>triTab;

    ConstructeurPoly(){
        carreTab = new ArrayList<Carre>();
        triTab = new ArrayList<Triangle>();
        constucteurTriangle();
        constructeurCarre();
    }
    private void constucteurTriangle(){
        triTab.add(new Triangle(4));
    }
    private void constructeurCarre(){
        carreTab.add(new Carre(6));
    }
}
