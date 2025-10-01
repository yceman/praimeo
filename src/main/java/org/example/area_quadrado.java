package org.example;

public class area_quadrado {
    public static void main (String args[]) {
        int intArea;
        dimensao Quadrado = new dimensao();
        Quadrado.intBase = 4;
        Quadrado.intAltura = 4;
        intArea = (Quadrado.intBase * Quadrado.intAltura);

        System.out.println("A área do quadrado é = "+intArea);
    }
}
