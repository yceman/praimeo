package org.example;

public class area_trapezio {
    public static void main(String args[]) {
        int intArea, intBaseMenor, intBaseMaior;
        dimensao Trapezio = new dimensao();

        intBaseMenor = 3;
        intBaseMaior = 5;
        Trapezio.intBase = (intBaseMenor + intBaseMaior);
        Trapezio.intAltura = 4;
        intArea = (Trapezio.intBase * Trapezio.intAltura) / 2;
        System.out.println("A área do Trapezio é = "+intArea);
    }
}
