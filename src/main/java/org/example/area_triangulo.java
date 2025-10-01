package org.example;

public class area_triangulo {
    public static void main (String args[]) {
        int intArea;
        dimensao Triangulo = new dimensao();
        Triangulo.intBase = 6;
        Triangulo.intAltura = 3;

        intArea = (Triangulo.intBase * Triangulo.intAltura) / 2;

        System.out.println("A área do triângulo é = "+intArea);
    }
}
