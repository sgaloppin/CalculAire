package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ConstructeurPoly test = new ConstructeurPoly();
        Triangle testTri = new Triangle(4);
        Carre testCarre = new Carre (5);
        System.out.println("Aire Triangle : " + testTri.aire());
        System.out.println("Aire Carre : " + testCarre.aire());

        System.out.println("L'aire du premier carré de la liste est : " + test.carreTab.get(0).aire());
        System.out.println("L'aire du premier triangle de la liste est : " + test.triTab.get(0).aire());
        System.out.println("Test static methode" + Geometrie.SomePerimCarre(test.carreTab));
        Affichage.affichage(test);
    }
}
